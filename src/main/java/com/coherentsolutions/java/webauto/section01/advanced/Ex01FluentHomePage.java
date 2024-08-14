package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.section01.Ex02BasePage;
import org.openqa.selenium.By;

/**
 * FluentHomePage demonstrates the use of the Fluent Interface pattern in a Page Object.
 * This pattern allows for more readable and chainable method calls.
 */
public class Ex01FluentHomePage extends Ex02BasePage {

    private static final By CHECKBOX_LINK = By.cssSelector("a[href *= 'checkboxes']");
    private static final By DATA_TABLE_LINK = By.cssSelector("a[href *= 'tables']");
    private static final By DROPDOWN_LINK = By.cssSelector("a[href *= 'dropdown']");

    /**
     * Clicks on the checkbox link and returns the current HomePage object for further actions.
     *
     * @return the current instance of FluentHomePage.
     */
    public Ex01FluentHomePage clickCheckboxLink() {
        driver.findElement(CHECKBOX_LINK).click();
        return this;
    }

    /**
     * Clicks on the data table link and returns the current HomePage object for further actions.
     *
     * @return the current instance of FluentHomePage.
     */
    public Ex01FluentHomePage clickDataTableLink() {
        driver.findElement(DATA_TABLE_LINK).click();
        return this;
    }

    /**
     * Clicks on the dropdown link and returns the current HomePage object for further actions.
     *
     * @return the current instance of FluentHomePage.
     */
    public Ex01FluentHomePage clickDropdownLink() {
        driver.findElement(DROPDOWN_LINK).click();
        return this;
    }
}
