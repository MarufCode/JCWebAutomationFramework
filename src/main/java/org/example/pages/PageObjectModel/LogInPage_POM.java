package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class LogInPage_POM extends CommonToAllPage {

    WebDriver driver;

    public LogInPage_POM(){
      super();
    }

    // Page Locators

    By username = By.id("username");
    By password = By.id("password");
    By logIn_Button = By.xpath("//button[contains(text(), ' Login ')]");
    By title = By.xpath("//div[contains(text(), 'Hello there! ')]");
    By err_msg = By.xpath("//span[contains(text(), 'Invalid User ID or Password. Please try again.')]");
    By logInButton = By.xpath("//button[contains(text(), ' Login ')]");





    // Page Actions
    public String LogInWithInValidCred() throws InterruptedException, IOException {
        presenceOfElement(title);
       enterInput(username, PropertyReader.readKey("username"));
       enterInput(password, "admin");
       jsClick(logInButton);
        presenceOfElement(err_msg);
        visibilityOfElement(err_msg);
        return getElement(err_msg).getText();
    }

    public void LogInWithValidCred() throws InterruptedException, IOException {
        presenceOfElement(title);
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        jsClick(logInButton);
    }


    public DashboardPage_POM afterLoginWithValidCred(){
        return new DashboardPage_POM();
    }


















}
