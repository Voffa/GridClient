package com.gridhelper.api.exceptions;

public class GridHelperException extends RuntimeException {

    public GridHelperException() {
    }

    public GridHelperException(String message) {
        super(message);
    }

    public GridHelperException(String message, Throwable cause) {
        super(message, cause);
    }

    public GridHelperException(Throwable cause) {
        super(cause);
    }

    public GridHelperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
