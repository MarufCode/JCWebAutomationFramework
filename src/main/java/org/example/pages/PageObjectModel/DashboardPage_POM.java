package org.example.pages.PageObjectModel;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {


    // Page Locators

    By Dashboard = By.xpath("//h1[contains(text(), ' Home ')]");





    // Page Actions
    public String loggedInTitle(){
        presenceOfElement(Dashboard);
        visibilityOfElement(Dashboard);
        jsClick(Dashboard);
        return getElement(Dashboard).getText().trim();
    }













}
