package com.ria.serenity.steps.ria;

import com.ria.page_object.pages.ria.RiaResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class RiaResultPageSteps extends ScenarioSteps {

    private RiaResultPage riaResultPage;

    public RiaResultPageSteps(final Pages pages) {
        this.riaResultPage = pages.getPage(RiaResultPage.class);
    }

    @Step
    public String retrieveSearchInputText() {
        return riaResultPage.getHeaderPanel().retrieveSearchInputText();
    }

    @Step
    public String retrieveSearchQueryText() {
        return riaResultPage.retrieveSearchQueryText();
    }

    @Step
    public List<String> getListProductText() {
        return riaResultPage.getSearchPanel().getListProductTextUsingStreamApi();
    }

}
