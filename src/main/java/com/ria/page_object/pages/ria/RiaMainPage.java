package com.ria.page_object.pages.ria;

import com.ria.page_object.pages.AbstractPage;
import com.ria.page_object.panels.ria.RiaHeaderPanel;
import org.openqa.selenium.WebDriver;

public class RiaMainPage extends AbstractPage {

    private static final String HEADER_LOCATOR = "//header[@class='app-header mhide']";

    public RiaMainPage(final WebDriver webDriver) {
        super(webDriver);
    }

    public RiaHeaderPanel getHeaderPanel() {
        return new RiaHeaderPanel(find(HEADER_LOCATOR),this);
    }

}
