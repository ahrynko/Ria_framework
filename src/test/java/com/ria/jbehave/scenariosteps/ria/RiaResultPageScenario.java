package com.ria.jbehave.scenariosteps.ria;

import com.ria.logging.Logger;
import com.ria.serenity.steps.ria.RiaResultPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import java.util.List;

public class RiaResultPageScenario {

    @Steps
    private RiaResultPageSteps riaResultPageSteps;

    @Then("following search text in input is displayed: '$text'")
    public void verifySearchInputText(final String expectedSearchInputText) {

        final String actualSearchInputText = riaResultPageSteps.retrieveSearchInputText();

        Assert.assertEquals("There is incorrect search text displayed!",
                expectedSearchInputText, actualSearchInputText);

        Logger.out.info("Search Text with site: " + actualSearchInputText);
    }

    @Then("following search query text is displayed: '$text'")
    public void verifySearchQueryText(final String expectedSearchQueryText) {

        final String actualSearchQueryText = riaResultPageSteps.retrieveSearchQueryText();

        Assert.assertEquals("There is incorrect search query text displayed!",
                expectedSearchQueryText, actualSearchQueryText);

        Logger.out.info("Search Query Text with site: " + actualSearchQueryText);
    }

    @Then("products are contains by the specified text: '$text'")
    public void retrievedProductList(final List<String> expectedProductList) {

        final List<String> actualSearchList = riaResultPageSteps.getListProductText();

        Assert.assertFalse("There are not item found! ", actualSearchList.isEmpty());

        actualSearchList.forEach(text -> {
            Assert.assertTrue("There is not such text present! ",text.contains("Xiomi Redmi"));
        });

        Logger.out.info(actualSearchList);
        Logger.out.info(actualSearchList.size());
    }
}
