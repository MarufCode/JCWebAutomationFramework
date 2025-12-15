package org.example.pages.PageFactory;

import org.example.base.CommonToAllPage;
import org.example.pages.PageObjectModel.DashboardPage_POM;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LogInPage_PF extends CommonToAllPage {

    WebDriver driver;

    public LogInPage_PF(WebDriver driver){
      super();
        PageFactory.initElements(driver, this);
    }

    // Page Locators

    @FindBy(id = "username")
    private WebElement username;


    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[contains(text(), ' Login ')]")
    private WebElement logIn_Button;

    @FindBy(xpath = "//div[contains(text(), 'Hello there! ')]")
    private WebElement title;

    @FindBy(xpath = "//span[contains(text(), 'Invalid User ID or Password. Please try again.')]")
    private WebElement err_msg;

    @FindBy(xpath = "//button[contains(text(), ' Login ')]")
    private WebElement logInButton;





//    // Page Actions
//    public String LogInWithInValidCred() throws InterruptedException, IOException {
//        presenceOfElement(title);
//       enterInput(username, PropertyReader.readKey("username"));
//       enterInput(password, "admin");
//       jsClick(logInButton);
//        presenceOfElement(err_msg);
//        visibilityOfElement(err_msg);
//        return getElement(err_msg).getText();
//    }
//
//    public void LogInWithValidCred() throws InterruptedException, IOException {
//        presenceOfElement(title);
//        enterInput(username, PropertyReader.readKey("username"));
//        enterInput(password, PropertyReader.readKey("password"));
//        jsClick(logInButton);
//    }
//
//    public String LogInWithValidUserNameAndInValidPassword() throws InterruptedException, IOException {
//        presenceOfElement(title);
//        enterInput(username, PropertyReader.readKey("username"));
//        enterInput(password, PropertyReader.readKey("password"));
//        jsClick(logInButton);
//        return getElement(err_msg).getText();
//    }


    public DashboardPage_POM afterLoginWithValidCred(){
        return new DashboardPage_POM();
    }


















}
