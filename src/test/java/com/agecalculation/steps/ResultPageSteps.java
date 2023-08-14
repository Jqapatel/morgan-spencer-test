package com.agecalculation.steps;

import com.agecalculation.pages.HomePage;
import com.agecalculation.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class ResultPageSteps {
    @Given("^I am on the Result Page$")
    public void iAmOnTheResultPage() throws InterruptedException {
        new HomePage().enterName("XYZ");
        new HomePage().enterDAteOfBirth("26/08/2005");
        new HomePage().clickOnSubmitBtn();

    }

    @And("^I verify the text Hello name!$")
    public void iVerifyTheTextHelloName() throws InterruptedException {
        Thread.sleep(5);
        org.junit.Assert.assertEquals("XYZ", new ResultPage().verifyResultPageText());
    }

    @Then("^I verify the age of the person$")
    public void iVerifyTheAgeOfThePerson() throws InterruptedException {
        Thread.sleep(5);
        Assert.assertEquals("17", new ResultPage().verifyAge());
}

}
