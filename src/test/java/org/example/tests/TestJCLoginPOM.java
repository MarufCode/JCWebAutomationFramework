package org.example.tests;

import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.DashboardPage_POM;
import org.example.pages.PageObjectModel.LogInPage_POM;
import org.example.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.io.IOException;

public class TestJCLoginPOM extends CommonToAllTest {


    @Test(priority = 1)
    @Owner("Maruf")
    public void testLoginNegative() throws InterruptedException, IOException {

        LogInPage_POM logInPagePom = new LogInPage_POM();
        logInPagePom.openJCLogInURL();
        String err_msg_text = logInPagePom.LogInWithInValidCred();

        Assert.assertEquals(err_msg_text, "Invalid User ID or Password. Please try again.");

        Assertions.assertThat(err_msg_text)
                .isNotBlank()
                .isNotNull()
                .contains(PropertyReader.readKey("error_msg"));


    }
    @Test(priority = 2)
    @Owner("Maruf")
    public void testLoginPositive() throws InterruptedException, IOException {

        LogInPage_POM logInPagePom = new LogInPage_POM();
        logInPagePom.openJCLogInURL();
        logInPagePom.LogInWithValidCred();
        DashboardPage_POM dashboardPagePom = logInPagePom.afterLoginWithValidCred();
        dashboardPagePom.loggedInTitle();
        String expected_dashboard_text = dashboardPagePom.loggedInTitle();

        Assert.assertEquals(expected_dashboard_text, PropertyReader.readKey("expected_dashboard_text"));

        Assertions.assertThat(expected_dashboard_text)
                .isNotNull()
                .isNotBlank();
    }


    @Test
    @Owner("Maruf")
    public void testLogInWithValidUserNameAndInValidPassword() throws IOException, InterruptedException {
        LogInPage_POM logInPagePom = new LogInPage_POM();
        logInPagePom.openJCLogInURL();
        logInPagePom.LogInWithValidUserNameAndInValidPassword();

        String err_msg_txt = logInPagePom.LogInWithValidUserNameAndInValidPassword();
        Assertions.assertThat(err_msg_txt)
                .isNotNull()
                .isNotBlank()
                .contains("Invalid User ID or Password. Please try again.");
    }



}
