package org.example.basetest;

import org.example.driver.DriverManager;
import org.example.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {


    @BeforeMethod
    public void setup(){
        DriverManagerTL.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerTL.down();
    }










}
