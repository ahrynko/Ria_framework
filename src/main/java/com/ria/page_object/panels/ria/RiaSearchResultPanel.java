package com.ria.page_object.panels.ria;

import com.ria.page_object.pages.AbstractPage;
import com.ria.page_object.panels.AbstractPanel;
import net.serenitybdd.core.pages.WebElementFacade;

public class RiaSearchResultPanel extends AbstractPanel {

    private static final String SEARCH_RESULT_INPUT_LOCATOR = ".//input[@class='flex-input boxed autocomplete__input']";

    public RiaSearchResultPanel(final WebElementFacade panelBaseLocation, final AbstractPage driverDelegate) {
        super(panelBaseLocation, driverDelegate);
    }

    public String retrieveSearchInputText() {
        return findBy(SEARCH_RESULT_INPUT_LOCATOR).waitUntilVisible().getValue();
    }

}
