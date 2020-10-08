package com.ria.jbehave.scenariosteps.ria;

import com.ria.serenity.steps.ria.RiaMainPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class RiaMainPageScenario {

    @Steps
    private RiaMainPageSteps riaMainPageSteps;

    @Given("user opened site by url: '$url'")
    public void openRiaMainPage(final String url) {
        riaMainPageSteps.openPageByUrl(url);
    }

    @When("search for next text: '$text'")
    public void searchFor(final String text){
        riaMainPageSteps.searchFor(text);
    }

}
