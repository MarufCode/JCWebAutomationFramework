package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;

public class LogInPagePOM_DDT extends CommonToAllPage {

    // Locators
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginBtn = By.xpath("//button[contains(text(), ' Login ')]");
    private final By errorMsg = By.xpath("//span[contains(text(), 'Invalid User ID or Password. Please try again.')]");
    private final By dashboardTitle = By.xpath("//div[contains(text(), 'Hello there! ')]");

    public String login(String username, String password) {

        enterInput(usernameInput, username);
        enterInput(passwordInput, password);
        jsClick(loginBtn);

        presenceOfElement(usernameInput);
        presenceOfElement(passwordInput);

        if (isErrorMessageDisplayed()) {
            return getErrorMessageText();
        }
        return getDashboardTitle();
    }

    private boolean isErrorMessageDisplayed() {
        try {
            return visibilityOfElement(errorMsg).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private String getErrorMessageText() {
        return getElement(errorMsg).getText();
    }

    private String getDashboardTitle() {
        return getElement(dashboardTitle).getText();
    }
}
