package org.example.base;

import org.example.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPage {

    WebDriver driver;


    public CommonToAllPage(){

    }


    public void openJCLogInURL(){
        getDriver().get("https://jc.greythr.com/");
    }

    public void clickElement(By by){
        getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key){
       getDriver().findElement(by).sendKeys(key);
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
