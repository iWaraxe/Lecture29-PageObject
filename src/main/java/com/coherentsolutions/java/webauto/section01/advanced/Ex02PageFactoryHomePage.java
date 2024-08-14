package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.section01.Ex02BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * PageFactoryHomePage demonstrates the use of Selenium's PageFactory pattern.
 * This pattern simplifies the initialization of web elements on a page.
 */
public class Ex02PageFactoryHomePage extends Ex02BasePage {

    @FindBy(css = "a[href *= 'checkboxes']")
    private WebElement checkboxLink;

    @FindBy(css = "a[href *= 'tables']")
    private WebElement dataTableLink;

    @FindBy(css = "a[href *= 'dropdown']")
    private WebElement dropdownLink;

    /**
     * Constructor that initializes the WebElements using PageFactory.
     *
     * @param driver the WebDriver instance to be used.
     */
    public Ex02PageFactoryHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks on the checkbox link.
     */
    public void clickCheckboxLink() {
        checkboxLink.click();
    }

    /**
     * Clicks on the data table link.
     */
    public void clickDataTableLink() {
        dataTableLink.click();
    }

    /**
     * Clicks on the dropdown link.
     */
    public void clickDropdownLink() {
        dropdownLink.click();
    }
}
