package org.example.base;

import org.example.driver.DriverManager;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

//import static org.example.driver.DriverManager.getDriver;
import static org.example.driver.DriverManagerTL.getDriver;

public class CommonToAllPage {

    WebDriver driver;


    public CommonToAllPage(){

    }


    public void openJCLogInURL() {
        getDriver().get(PropertyReader.readKey("url"));
    }

    public void clickElement(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void jsClick(By by){
        WebElement element = presenceOfElement(by);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element);
    }



    public void enterInput(By by, String key) {
        WebElement element = visibilityOfElement(by);
        element.clear();
        element.sendKeys(key);
    }


    public void enterInput(WebElement element, String key){
       element.sendKeys(key);
    }


    public WebElement presenceOfElement(By elementLocation) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }


    public WebElement visibilityOfElement(By elementLocation) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }



    public WebElement getElement(By key){
        return getDriver().findElement(key);
    }






}
