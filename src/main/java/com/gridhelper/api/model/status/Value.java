package com.gridhelper.api.model.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "message",
        "class",
        "stackTrace"
})
public class Value {

    @JsonProperty("message")
    private String message;

    @JsonProperty("class")
    private String _class;

    @JsonProperty("stackTrace")
    private List<StackTrace> stackTrace = null;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("stackTrace")
    public List<StackTrace> getStackTrace() {
        return stackTrace;
    }

    @JsonProperty("stackTrace")
    public void setStackTrace(List<StackTrace> stackTrace) {
        this.stackTrace = stackTrace;
    }
}
