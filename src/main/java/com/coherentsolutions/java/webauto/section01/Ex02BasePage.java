package com.coherentsolutions.java.webauto.section01;

import org.openqa.selenium.WebDriver;

/**
 * BasePage is an abstract class that provides a common structure for all page classes.
 * It holds the WebDriver instance and is used as a parent class for specific pages.
 */
public abstract class Ex02BasePage {

    protected WebDriver driver;

    /**
     * Constructor that initializes the WebDriver instance by calling DriverManager.
     */
    public Ex02BasePage() {
        this.driver = Ex01DriverManager.getDriver();
    }
}
