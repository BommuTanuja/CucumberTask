package com.motivity.Pages;

import com.motivity.Actions.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    SeleniumActions seleniumActions;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;

       // seleniumActions = new SeleniumActions(driver);
    }

    @FindBy(xpath = "//div[@class='midheight']/descendant::li/a[text()='Contact']")
    WebElement contactField;
    @FindBy(xpath = "//div[contains(@class,'mainFormInPage')]/descendant::div[@class='ContactBody ']/descendant::div[@id='formContent']/descendant::div[@class='TextBoxContainer TextBoxContainer-mandatory']/input[@name='name']")
    WebElement nameInputField;
    @FindBy(xpath = "//div[contains(@class,'TextBoxContainer-mandatory')]/input[@name='email']")
    WebElement emailInputField;
    @FindBy(xpath = "//div[@class='MessageArea MessageArea-mandatory']/textarea[@name='message']")
    WebElement messageField;
    @FindBy(xpath = "//div[@id='sendinnerBox']/div/div/div[@class='buttonIcon']")
    WebElement  sendButton;
    @FindBy(xpath = "//div[@class='SuccessMessage']")
    WebElement thanksMessage;


    public  void clickOnContact(){
        contactField.click();
    }


    public void fillTheForm(String name,String mail,String msg){
        WebElement firstFrame = driver.findElement(By.xpath("//div[@class='thumbCellSplit']/iframe"));
        driver.switchTo().frame(firstFrame);
        nameInputField.sendKeys(name);
        emailInputField.sendKeys(mail);
        messageField.sendKeys(msg);

    }
    public void clickOnSendButton(){
        sendButton.click();
    }
    public boolean verifyMessage(){

        return thanksMessage.isDisplayed();

    }
}
