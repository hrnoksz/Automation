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

}
