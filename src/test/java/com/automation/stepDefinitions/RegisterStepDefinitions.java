package com.automation.stepDefinitions;

import com.automation.pages.BasePage;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class RegisterStepDefinitions {

    BasePage page = new BasePage();

    Faker faker = new Faker();

    String firstname;

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

    @When("user enter username and email address")
    public void user_enter_username_and_email_address() {
        firstname = faker.name().firstName();
        page.name.sendKeys(firstname);
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

    @Then("user select checkbox1")
    public void user_select_checkbox1() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(page.checkBoxOne));

        page.checkBoxOne.click();
    }
    @Then("user select checkbox2")
    public void user_select_checkbox2() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(page.checkBoxTwo));
        page.checkBoxTwo.click();
    }
    @Then("user fill following details")
    public void user_fill_following_details(Map<String, String> informationTable) {

        page.firstName.sendKeys(informationTable.get("FirstName"));
        page.lastName.sendKeys(informationTable.get("LastName"));
        page.company.sendKeys(informationTable.get("Company"));
        page.addressOne.sendKeys(informationTable.get("Address"));
        page.addressTwo.sendKeys(informationTable.get("Address2"));
        Select country = new Select(page.country);
        country.selectByVisibleText("United States");
        page.city.sendKeys(informationTable.get("City"));
        page.state.sendKeys(informationTable.get("State"));
        page.zipcode.sendKeys(informationTable.get("ZipCode"));
        page.mobile_number.sendKeys(informationTable.get("MobileNumber"));

    }

    @Then("user clicks on create account button")
    public void user_clicks_on_create_account_button() {
        page.createBtn.click();
    }
    @Then("verify {string} is visible")
    public void verify_is_visible(String message) {

        System.out.println("page.accountCreatedMsg.getText() = " + page.accountCreatedMsg.getText());
        Assert.assertTrue(page.accountCreatedMsg.getText().equalsIgnoreCase(message));

    }
    @Then("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
        page.continueBtn.click();
    }


    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String message) {
        message = "Logged in as " + firstname;
        System.out.println("page.loggedMessage.getText() = " + page.loggedMessage.getText());
        Assert.assertTrue(page.loggedMessage.getText().equalsIgnoreCase(message));
    }
    @Then("user clicks on Delete Account button")
    public void user_clicks_on_delete_account_button() {
        page.deleteBtn.click();
    }


    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {

    }




}
