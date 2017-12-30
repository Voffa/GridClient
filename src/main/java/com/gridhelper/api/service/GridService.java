package com.gridhelper.api.service;

import com.gridhelper.api.model.hub.HubInfo;
import com.gridhelper.api.model.session.GridSession;
import com.gridhelper.api.model.status.Status;
import org.springframework.web.client.RestTemplate;

public class GridService {

    private RestTemplate restTemplate;
    private String url;

    public GridService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GridSession getSessionInfo(String session) {
        return restTemplate.getForEntity(url + "/grid/api/testsession?session={sessionId}", GridSession.class, session).getBody();
    }

    public HubInfo getHubInfo() {
        return restTemplate.getForEntity(url + "/grid/api/hub/", HubInfo.class).getBody();
    }

    public Status getStatus() {
        return restTemplate.getForEntity(url + "/wd/hub/status", Status.class).getBody();
    }

    public void shutDown() {
        restTemplate.getForEntity(url + "/lifecycle-manager?action=shutdown", Void.class);
    }
}
