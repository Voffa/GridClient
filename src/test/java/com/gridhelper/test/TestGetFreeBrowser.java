package com.gridhelper.test;

import com.gridhelper.api.GridClient;
import com.gridhelper.api.model.Browser;
import com.gridhelper.api.model.HubMap;
import org.testng.annotations.Test;

public class TestGetFreeBrowser {

    private static final String URL = "http://localhost:4444";

    @Test
    public void testGetFreeBrowser() {
        HubMap hubMap = new HubMap();
        hubMap.addBrowserNode("4442", Browser.CHROME);
        hubMap.addBrowserNode("4443", Browser.FIREFOX);

        GridClient gridClient = new GridClient(URL, hubMap);
        Browser browser = gridClient.getFreeBrowser();
        System.out.println(browser);
    }
}
