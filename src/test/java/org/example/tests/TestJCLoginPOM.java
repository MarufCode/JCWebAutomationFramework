package org.example.tests;

import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.LogInPage_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJCLoginPOM extends CommonToAllTest {


    private static final Logger log = LoggerFactory.getLogger(TestJCLoginPOM.class);

    @Test
    public void testLoginNegative() throws InterruptedException {

        LogInPage_POM logInPagePom = new LogInPage_POM();
        logInPagePom.openJCLogInURL();
        String err_msg_text = logInPagePom.LogInWithInValidCred();

        Assert.assertEquals(err_msg_text, "Invalid User ID or Password. Please try again.");





    }
}
