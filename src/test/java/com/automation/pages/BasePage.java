package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Signup / Login")
    public WebElement signupBtn;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement messageOne;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailAddress;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement newSignBtn;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement messageTwo;

    @FindBy(id = "id_gender1")
    public WebElement title;

    @FindBy(id = "password")
    public WebElement password;

    //@FindBy(xpath = "//select[@id='days']/option")
    //public List<WebElement> days;

    @FindBy(xpath = "//select[@id = 'days']")
    public WebElement days;

    @FindBy(xpath = "//select[@id = 'months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id = 'years']")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement checkBoxOne;

    @FindBy(id = "optin")
    public WebElement checkBoxTwo;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement addressOne;

    @FindBy(id = "address2")
    public WebElement addressTwo;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipcode;

    @FindBy(id = "mobile_number")
    public WebElement mobile_number;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createBtn;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedMsg;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//b/..")
    public WebElement loggedMessage;


}
