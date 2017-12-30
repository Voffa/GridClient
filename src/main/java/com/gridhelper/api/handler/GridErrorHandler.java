package com.gridhelper.api.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

public class GridErrorHandler implements ResponseErrorHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GridErrorHandler.class);

    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        HttpStatus.Series series = clientHttpResponse.getStatusCode().series();
        return HttpStatus.Series.CLIENT_ERROR.equals(series)
                || HttpStatus.Series.SERVER_ERROR.equals(series);
    }

    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        LOG.error("Response error: {} {}", clientHttpResponse.getStatusCode(), clientHttpResponse.getStatusText());
    }
}
