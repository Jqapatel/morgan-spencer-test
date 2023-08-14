package com.agecalculation.pages;

import com.agecalculation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'How old are you?')]")
    WebElement homepageText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='inputName']")
    WebElement enterName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='inputBirthday']")
    WebElement dateOfBirth;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submitButton']")
    WebElement submitBtn;

    public String verifyHomePageText() {
        String text = getTextFromElement(homepageText);
        log.info("Getting text from Home Page: " + homepageText.toString());
        return text;
    }

    public void enterName(String name) {
        log.info("Enter your name: " + enterName.toString());
        sendTextToElement(enterName, name);
    }

    public void enterDAteOfBirth(String date) {
        log.info("Enter your date of birth: " + dateOfBirth.toString());
        sendTextToElement(dateOfBirth, date);
    }

    public void clickOnSubmitBtn() {
        log.info("Clicking on Submit button: " + submitBtn.toString());
        clickOnElement(submitBtn);
    }

}
