package com.ria.serenity.steps.ria;

import com.ria.page_object.pages.ria.RiaMainPage;
import com.ria.page_object.pages.ria.RiaResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class RiaMainPageSteps extends ScenarioSteps {

    private RiaMainPage riaMainPage;

    public RiaMainPageSteps(final Pages pages) {
        this.riaMainPage = pages.getPage(RiaMainPage.class);
    }

    @Step
    public void openPageByUrl(final String commonUrl) {
        riaMainPage.openUrl(commonUrl);
    }

    @Step
    public Class<RiaResultPage> searchFor(final String text) {
        riaMainPage.getHeaderPanel().inputSearchText(text);
        return RiaResultPage.class;
    }
}
