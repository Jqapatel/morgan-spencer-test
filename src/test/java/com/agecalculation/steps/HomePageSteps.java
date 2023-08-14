package com.agecalculation.steps;

import com.agecalculation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("^I am on the Home Page$")
    public void iAmOnTheHomePage() {
    }

    @When("^I verify the text on the Home page$")
    public void iVerifyTheTextOnTheHomePage() {
        String expectedText = "How old are you?";
        String actualText = new HomePage().verifyHomePageText();
        Assert.assertEquals(expectedText, actualText, "Text not displayed");
    }

    @And("^I enter User Name$")
    public void iEnterUserName( ) {
        new HomePage().enterName("XYZ");
    }

    @And("^I enter the Date of Birth$")
    public void iEnterTheDateOfBirth() {
        new HomePage().enterDAteOfBirth("26/08/2005");
    }

    @Then("^I click on Submit$")
    public void iClickOnSubmit() {
        new HomePage().clickOnSubmitBtn();
    }

}
