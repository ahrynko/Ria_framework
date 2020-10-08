package com.ria.page_object.panels.ria;

import com.ria.page_object.pages.AbstractPage;
import com.ria.page_object.panels.AbstractPanel;
import net.serenitybdd.core.pages.WebElementFacade;

public class RiaHeaderPanel extends AbstractPanel {

    private static final String SEARCH_INPUT_LOCATOR = ".//input[@class='search-input boxed autocomplete__input flex-input js_autocomplete_input_new']";

    public RiaHeaderPanel(final WebElementFacade panelBaseLocation, final AbstractPage driverDelegate) {
        super(panelBaseLocation, driverDelegate);
    }

    public void inputSearchText (final String text){
        findBy(SEARCH_INPUT_LOCATOR).typeAndEnter(text);
    }
}
