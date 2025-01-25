package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJCLogin {

    @Test
    public void testloginPositive(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://jc.greythr.com/uas/portal/auth/login");
        Assert.assertEquals(driver.getCurrentUrl(), "https://jc.greythr.com/");
        driver.quit();
    }
}
