package org.example.tests;

import org.example.basetest.CommonToAllTest;
import org.example.pages.PageObjectModel.LogInPagePOM_DDT;
import org.example.utils.ExcelReader;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.example.listeners.TestListener.class)
public class testLoginDDT_Fail extends CommonToAllTest {

    @Test(dataProvider = "loginData", dataProviderClass = ExcelReader.class)
    public void testLogInDDT_Failure(String username, String password) {

        LogInPagePOM_DDT loginPage = new LogInPagePOM_DDT();
        loginPage.openJCLogInURL();

        String resultText = loginPage.login(username, password);
        Assert.assertEquals(
                resultText,
                "THIS TEXT WILL NEVER MATCH", "Forcing failure to verify screenshot capture");
    }
}
