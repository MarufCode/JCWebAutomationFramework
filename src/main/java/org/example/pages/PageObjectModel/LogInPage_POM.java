package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

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





    // Page Actions
    public String LogInWithInValidCred() throws InterruptedException {
        presenceOfElement(title);
       enterInput(username, "JC75464556");
       enterInput(password, "JC75464556");
       clickElement(logIn_Button);
        try
        {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
//        driver.findElement(err_msg).getText();
        return getElement(err_msg).getText();
    }













}
