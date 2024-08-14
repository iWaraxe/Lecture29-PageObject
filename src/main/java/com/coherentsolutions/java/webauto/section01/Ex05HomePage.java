package com.coherentsolutions.java.webauto.section01;

import org.openqa.selenium.By;

/**
 * HomePage represents the main page of the application.
 * It provides methods to navigate to different sections of the website.
 */
public class Ex05HomePage extends Ex02BasePage {

    private static final By CHECKBOX_LINK = By.cssSelector("a[href *= 'checkboxes']");
    private static final By DATA_TABLE_LINK = By.cssSelector("a[href *= 'tables']");
    private static final By DROPDOWN_LINK = By.cssSelector("a[href *= 'dropdown']");

    /**
     * Navigates to the Checkbox page by clicking the corresponding link.
     *
     * @return a new instance of CheckboxPage.
     */
    public Ex06CheckboxPage navigateToCheckboxPage() {
        driver.findElement(CHECKBOX_LINK).click();
        return new Ex06CheckboxPage();
    }
}
