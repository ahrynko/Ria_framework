package com.ria.page_object.pages.ria;

import com.ria.page_object.pages.AbstractPage;
import com.ria.page_object.panels.ria.RiaSearchResultPanel;
import com.ria.page_object.panels.ria.RiaSummaryResultPanel;
import org.openqa.selenium.WebDriver;

public class RiaResultPage extends AbstractPage {

    private static final String RESULT_HEADER_LOCATOR = "//div[@class='search--form js-explore-search']";
    private static final String RESULT_SEARCH_PANEL = "//div[@class='result-explore']";

    private static final String SEARCH_RESULT_TEXT = "//span[@class='item-selected-name']";


    public RiaResultPage(final WebDriver webDriver) {
        super(webDriver);
    }

    public RiaSearchResultPanel getHeaderPanel() {
        return new RiaSearchResultPanel(find(RESULT_HEADER_LOCATOR),this);
    }

    public RiaSummaryResultPanel getSearchPanel() {
        return new RiaSummaryResultPanel(find(RESULT_SEARCH_PANEL),this);
    }

    public String retrieveSearchQueryText() {
        return find(SEARCH_RESULT_TEXT).waitUntilVisible().getTextContent().trim();
    }
}
