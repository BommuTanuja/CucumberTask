package com.motivity.Steps;

import com.motivity.Pages.HomePage;
import com.motivity.Runner.runner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class HomeSteps extends runner {

   public HomePage homePage  = new HomePage(driver);
    public static WebDriver driver;


//    @After
//    public static void killSession(){
//        driver.quit();
//    }
    @Before
    public  static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("User on welcome screen and click on contact")
    public void user_on_welcome_screen_and_click_on_contact()  {

        homePage.clickOnContact();

    }
    @Then("User enter name {string} and email {string} and message {string}")
    public void user_enter_name_and_email_and_message(String string, String string2, String string3)throws InterruptedException {
        homePage.fillTheForm(string,string2,string3);
        Thread.sleep(1000);
    }
    @Then("User should click on checkbox and submit form")
    public void user_should_click_on_checkbox_and_submit_form() {
        homePage.clickOnSendButton();
    }
    @Then("User verify successful login")
    public void user_verify_successful_login() {
        homePage.verifyMessage();
        Assert.assertTrue(homePage.verifyMessage());


    }
}
