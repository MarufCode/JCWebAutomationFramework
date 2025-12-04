package org.example.tests;

import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.LogInPage_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJCLogin {


    @Test
    public void testLoginNegative() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://jc.greythr.com/");

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("JC00924");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Maruf@7");

        WebElement logInButton = driver.findElement(By.xpath("//button[contains(text(), ' Login ')]"));
        logInButton.click();

        WebElement err_msg = driver.findElement(By.xpath("//span[contains(text(), 'Invalid User ID or Password. Please try again.')]"));
        String err_msg_text = err_msg.getText();

        Assert.assertEquals(err_msg_text, "Invalid User ID or Password. Please try again.");

        Thread.sleep(5000);

        driver.quit();



    }
}
