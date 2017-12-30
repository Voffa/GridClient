package com.gridhelper.api.model.session;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "msg",
        "success",
        "session",
        "internalKey",
        "inactivityTime",
        "proxyId"
})
public class GridSession {

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("success")
    private Boolean success;

    @JsonProperty("session")
    private String session;

    @JsonProperty("internalKey")
    private String internalKey;

    @JsonProperty("inactivityTime")
    private Integer inactivityTime;

    @JsonProperty("proxyId")
    private String proxyId;

    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("session")
    public String getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(String session) {
        this.session = session;
    }

    @JsonProperty("internalKey")
    public String getInternalKey() {
        return internalKey;
    }

    @JsonProperty("internalKey")
    public void setInternalKey(String internalKey) {
        this.internalKey = internalKey;
    }

    @JsonProperty("inactivityTime")
    public Integer getInactivityTime() {
        return inactivityTime;
    }

    @JsonProperty("inactivityTime")
    public void setInactivityTime(Integer inactivityTime) {
        this.inactivityTime = inactivityTime;
    }

    @JsonProperty("proxyId")
    public String getProxyId() {
        return proxyId;
    }

    @JsonProperty("proxyId")
    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }
}
