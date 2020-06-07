package com.auto.qa.pages;

import com.auto.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn extends TestBase {
    //Page Factory or Object Repo

    @FindBy(name="email")
    WebElement username;

    @FindBy(name="passwd")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement signinBtn;

    @FindBy(xpath="//*[@id=\"create-account_form\"]/div")
    WebElement signupInput;

    @FindBy(xpath ="//*[@id=\"SubmitCreate\"]/span")
    WebElement signupBtn;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement logoImg;

    //Initialization page objects using Page Factory

    public SignIn(){
        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateSigninPageTitle(){
        return driver.getTitle();
    }

    public boolean validateLogoImg(){
        return logoImg.isDisplayed();
    }

    public Home login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        signinBtn.click();

        return new Home();
    }




}
