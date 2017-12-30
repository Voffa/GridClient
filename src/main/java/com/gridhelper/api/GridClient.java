package com.gridhelper.api;

import com.gridhelper.api.exceptions.GridHelperException;
import com.gridhelper.api.model.Browser;
import com.gridhelper.api.model.HubMap;
import com.gridhelper.api.model.hub.HubInfo;
import com.gridhelper.api.model.session.GridSession;
import com.gridhelper.api.model.status.Status;
import com.gridhelper.api.service.GridService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GridClient {

    private static final Logger LOG = LoggerFactory.getLogger(GridClient.class);
    private GridService gridService;
    private HubMap hubMap;

    public GridClient(String url) {
        this(url, new HubMap());
    }

    public GridClient(String url, HubMap hubMap) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:app-context.xml");
        gridService = (GridService) ctx.getBean("gridService");
        gridService.setUrl(url);
        this.hubMap = hubMap;
    }

    public void setHubMap(HubMap hubMap) {
        this.hubMap = hubMap;
    }

    public HubMap getHubMap() {
        return hubMap;
    }

    public Browser getFreeBrowser() {
        if (hubMap.isEmpty()) {
            throw new GridHelperException("Hub map with infrastructure is not filled");
        }
        Status status = gridService.getStatus();
        List<String> sessionIds = getSessionIds(status.getValue().getMessage());
        List<String> browsersInUse = new ArrayList<>();
        sessionIds.forEach(id -> {
            GridSession gridSession = gridService.getSessionInfo(id.trim());
            String port = getProxyPort(gridSession.getProxyId());
            browsersInUse.add(port);
        });
        Optional<String> optPort = hubMap.getPorts().stream().filter(p -> !browsersInUse.contains(p)).findAny();
        if (optPort.isPresent()) {
            return hubMap.getBrowser(optPort.get());
        }
        LOG.debug("All nodes are busy");
        return Browser.ALL_BUSY;
    }

    public GridSession getSessionInfo(String sessionId) {
        return gridService.getSessionInfo(sessionId);
    }

    public HubInfo getHubInfo() {
        return gridService.getHubInfo();
    }

    public Status getStatus() {
        return gridService.getStatus();
    }

    public void shutDown() {
        gridService.shutDown();
    }

    private String getProxyPort(String proxyId) {
        String[] proxyTokens = proxyId.split(":");
        if (proxyTokens.length < 3) {
            throw new GridHelperException("Error on attempt to parse proxyId: " + proxyId);
        }
        LOG.debug("The following client is in use: {}", proxyTokens[2]);
        return proxyTokens[2];
    }

    private List<String> getSessionIds(String statusMessage) {
        String activeSessions = statusMessage.split("\\n")[1];
        return Arrays.asList(activeSessions.replaceAll(".*\\[|\\]|(ext. key )", "").split(","));
    }
}
