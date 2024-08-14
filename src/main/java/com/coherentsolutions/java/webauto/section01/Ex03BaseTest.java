package com.coherentsolutions.java.webauto.section01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * BaseTest is a base class for all test classes.
 * It sets up and tears down the WebDriver and handles the initialization of common resources.
 */
public class Ex03BaseTest {

    private static final String BASE_URL = Ex04TestConfig.get("url.home");
    protected Ex05HomePage homePage;

    /**
     * Initializes the test environment, including opening the browser and navigating to the home page.
     */
    @BeforeMethod
    public void init() {
        WebDriver driver = Ex01DriverManager.getDriver();
        driver.get(BASE_URL);
        homePage = new Ex05HomePage();
    }

    /**
     * Tears down the WebDriver instance after each test.
     */
    @AfterMethod
    public void closeBrowser() {
        Ex01DriverManager.tearDown();
    }
}
