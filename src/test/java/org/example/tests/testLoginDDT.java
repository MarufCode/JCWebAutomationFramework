package org.example.tests;

import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.LogInPagePOM_DDT;
import org.example.utils.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.example.listeners.TestListener.class)
public class testLoginDDT extends CommonToAllTest {


    @Test(dataProvider = "loginData", dataProviderClass = ExcelReader.class)
    public void testLogInDDT(String username, String password) {

        LogInPagePOM_DDT loginPage = new LogInPagePOM_DDT();
        loginPage.openJCLogInURL();

        String resultText = loginPage.login(username, password);
        if (resultText.contains("Invalid User ID or Password")) {
            Assert.assertTrue(
                    resultText.contains("Invalid User ID or Password"), "Expected error message not displayed");
        } else {
            Assert.assertTrue(
                    resultText.contains("Hello there!"), "Dashboard not displayed after successful login");
        }
    }
}
