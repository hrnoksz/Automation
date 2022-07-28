package com.automation.stepDefinitions;

import com.automation.pages.BasePage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class RegisterStepDefinitions {

    BasePage page = new BasePage();

    Faker faker = new Faker();


    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("Verify that homepage is visible successfully")
    public void verify_that_homepage_is_visible_successfully() {
        /*
        String expectedUrl= "https://automationexercise.com/";
        String currentUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
         */
        assertEquals(ConfigurationReader.getProperty("url"), Driver.getDriver().getCurrentUrl());
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

    @When("user enter name and email address")
    public void user_enter_name_and_email_address() {

        page.name.sendKeys(faker.name().firstName());
        page.emailAddress.sendKeys(faker.internet().emailAddress());
    }

    @When("user clicks on new signup button")
    public void user_clicks_on_new_signup_button() {
        page.newSignBtn.click();
    }

    @Then("Verify that enter account information is visible")
    public void verify_that_enter_account_information_is_visible() {
        assertTrue("Message is not displayed",page.messageTwo.isDisplayed());
    }

    @Then("fill details following information")
    public void fill_details_following_information() {
        page.title.click();
        page.password.sendKeys(faker.internet().password());
/*
        List<WebElement> days = page.days;
        List<String> day = new ArrayList<>();
        for (WebElement each : days) {
            day.add(each.getText());
        }

 */
        Select day = new Select(page.days);
        //There are 3 methods to select options
        day.selectByVisibleText("5");
        //day.selectByIndex(5);
        //day.selectByValue("5");
        Select month  = new Select(page.months);
        month.selectByVisibleText("October");
        Select year = new Select(page.years);
        year.selectByVisibleText("1973");
    }



}
