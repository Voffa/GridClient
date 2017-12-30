package com.gridhelper.api.model.hub;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "role",
        "prioritizer",
        "timeout",
        "throwOnCapabilityNotPresent",
        "nodePolling",
        "newSessionWaitTimeout",
        "cleanUpCycle",
        "port",
        "browserTimeout",
        "host",
        "servlets",
        "maxSession",
        "capabilityMatcher",
        "jettyMaxThreads"
})
public class HubInfo {

    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("role")
    private String role;

    @JsonProperty("prioritizer")
    private Object prioritizer;

    @JsonProperty("timeout")
    private Integer timeout;

    @JsonProperty("throwOnCapabilityNotPresent")
    private Boolean throwOnCapabilityNotPresent;

    @JsonProperty("nodePolling")
    private Integer nodePolling;

    @JsonProperty("newSessionWaitTimeout")
    private Integer newSessionWaitTimeout;

    @JsonProperty("cleanUpCycle")
    private Integer cleanUpCycle;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("browserTimeout")
    private Integer browserTimeout;

    @JsonProperty("host")
    private String host;

    @JsonProperty("servlets")
    private String servlets;

    @JsonProperty("maxSession")
    private Integer maxSession;

    @JsonProperty("capabilityMatcher")
    private String capabilityMatcher;

    @JsonProperty("jettyMaxThreads")
    private Integer jettyMaxThreads;

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("prioritizer")
    public Object getPrioritizer() {
        return prioritizer;
    }

    @JsonProperty("prioritizer")
    public void setPrioritizer(Object prioritizer) {
        this.prioritizer = prioritizer;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @JsonProperty("throwOnCapabilityNotPresent")
    public Boolean getThrowOnCapabilityNotPresent() {
        return throwOnCapabilityNotPresent;
    }

    @JsonProperty("throwOnCapabilityNotPresent")
    public void setThrowOnCapabilityNotPresent(Boolean throwOnCapabilityNotPresent) {
        this.throwOnCapabilityNotPresent = throwOnCapabilityNotPresent;
    }

    @JsonProperty("nodePolling")
    public Integer getNodePolling() {
        return nodePolling;
    }

    @JsonProperty("nodePolling")
    public void setNodePolling(Integer nodePolling) {
        this.nodePolling = nodePolling;
    }

    @JsonProperty("newSessionWaitTimeout")
    public Integer getNewSessionWaitTimeout() {
        return newSessionWaitTimeout;
    }

    @JsonProperty("newSessionWaitTimeout")
    public void setNewSessionWaitTimeout(Integer newSessionWaitTimeout) {
        this.newSessionWaitTimeout = newSessionWaitTimeout;
    }

    @JsonProperty("cleanUpCycle")
    public Integer getCleanUpCycle() {
        return cleanUpCycle;
    }

    @JsonProperty("cleanUpCycle")
    public void setCleanUpCycle(Integer cleanUpCycle) {
        this.cleanUpCycle = cleanUpCycle;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("browserTimeout")
    public Integer getBrowserTimeout() {
        return browserTimeout;
    }

    @JsonProperty("browserTimeout")
    public void setBrowserTimeout(Integer browserTimeout) {
        this.browserTimeout = browserTimeout;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("servlets")
    public String getServlets() {
        return servlets;
    }

    @JsonProperty("servlets")
    public void setServlets(String servlets) {
        this.servlets = servlets;
    }

    @JsonProperty("maxSession")
    public Integer getMaxSession() {
        return maxSession;
    }

    @JsonProperty("maxSession")
    public void setMaxSession(Integer maxSession) {
        this.maxSession = maxSession;
    }

    @JsonProperty("capabilityMatcher")
    public String getCapabilityMatcher() {
        return capabilityMatcher;
    }

    @JsonProperty("capabilityMatcher")
    public void setCapabilityMatcher(String capabilityMatcher) {
        this.capabilityMatcher = capabilityMatcher;
    }

    @JsonProperty("jettyMaxThreads")
    public Integer getJettyMaxThreads() {
        return jettyMaxThreads;
    }

    @JsonProperty("jettyMaxThreads")
    public void setJettyMaxThreads(Integer jettyMaxThreads) {
        this.jettyMaxThreads = jettyMaxThreads;
    }

}
