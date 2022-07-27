package com.automation.stepDefinitions;

import com.automation.pages.BasePage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class RegisterStepDefinitions {

    BasePage page = new BasePage();

    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("Verify that homepage is visible successfully")
    public void verify_that_homepage_is_visible_successfully() {
        String expectedUrl= "https://automationexercise.com/";
        String currentUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
    }
    @When("User clicks on signup button")
    public void user_clicks_on_signup_button() {
        page.signupBtn.click();
    }
    @Then("Verify New User Signup is visible")
    public void verify_new_user_signup_is_visible() {
        assertTrue(page.messageOne.isDisplayed());
        //System.out.println("page.messageOne.getText() = " + page.messageOne.getText());
    }
}