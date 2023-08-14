package com.agecalculation.pages;

import com.agecalculation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='XYZ']")
    WebElement resultPageTextName;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='17']")
    WebElement resultPageAge;

    public String verifyResultPageText() {
        String text = getTextFromElement(resultPageTextName);
        log.info("Getting text from result Page: " + resultPageTextName.toString());
        return text;
    }

    public String verifyAge() {
        String text = getTextFromElement(resultPageAge);
        log.info("Getting text from result Page: " + resultPageAge.toString());
        return text;
    }

}
