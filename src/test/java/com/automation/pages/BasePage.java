package com.automation.pages;

import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Signup / Login")
    public WebElement signupBtn;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement messageOne;
}
