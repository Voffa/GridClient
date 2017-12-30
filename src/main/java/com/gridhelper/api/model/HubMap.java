package com.gridhelper.api.model;

import com.gridhelper.api.exceptions.GridHelperException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HubMap {

    private static Map<String, Browser> hubMap = new HashMap<>();

    public void addBrowserNode(String port, Browser browser) {
        hubMap.put(port, browser);
    }

    public Browser getBrowser(String port) {
        if (hubMap.containsKey(port)) {
            return hubMap.get(port);
        }
        throw new GridHelperException("The following port is not mapped to any node: " + port);
    }

    public Set<String> getPorts() {
        return hubMap.keySet();
    }

    public boolean isEmpty(){
        return hubMap.isEmpty();
    }
}
