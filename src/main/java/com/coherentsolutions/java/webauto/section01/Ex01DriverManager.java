package com.coherentsolutions.java.webauto.section01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * DriverManager is responsible for managing the WebDriver instance.
 * It provides a thread-safe way to handle WebDriver and ensure it is reused across different tests.
 */
public class Ex01DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    /**
     * Retrieves the WebDriver instance, creating it if necessary.
     *
     * @return WebDriver instance.
     */
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            // Set up the WebDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();

            // Initialize the WebDriver instance
            WebDriver webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.set(webDriver);
        }
        return driver.get();
    }

    /**
     * Quits the WebDriver instance and removes it from the ThreadLocal storage.
     */
    public static void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.set(null);
        }
    }
}
