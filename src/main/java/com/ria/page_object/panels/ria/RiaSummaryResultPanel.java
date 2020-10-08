package com.ria.page_object.panels.ria;

import com.ria.page_object.pages.AbstractPage;
import com.ria.page_object.panels.AbstractPanel;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class RiaSummaryResultPanel extends AbstractPanel {

    private static final String TICKET_TITLE_RESULT = ".//div[@class='tticket']/a";

    public RiaSummaryResultPanel(final WebElementFacade panelBaseLocation, final AbstractPage driverDelegate) {
        super(panelBaseLocation, driverDelegate);
    }

    public List<String> getListProductTextUsingStreamApi() {
        return findAll(TICKET_TITLE_RESULT)
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
