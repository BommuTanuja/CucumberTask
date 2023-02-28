package com.motivity.Actions;

import com.motivity.Waits.SeleniumWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SeleniumActions {
    WebDriver driver;
    SeleniumWaits seleniumWaits;
    public SeleniumActions(WebDriver driver){
        this.driver=driver;
        seleniumWaits = new SeleniumWaits(driver);
    }

    public boolean waitAndClickOnElement(WebElement element){
        try{
            seleniumWaits .waitForElementToBeClickable(element).click();
            return true;
        }catch (Exception e){

            return false;
        }
    }
    public void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
