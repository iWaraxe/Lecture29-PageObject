package com.coherentsolutions.java.webauto.section01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * CheckboxPage represents the page containing checkboxes.
 * It provides methods to interact with the checkboxes on the page.
 */
public class Ex06CheckboxPage extends Ex02BasePage {

    private static final By HEADER = By.cssSelector(".example h3");
    private static final By CHECKBOX_1 = By.xpath(".//form[@id = 'checkboxes']/input[1]");
    private static final By CHECKBOX_2 = By.xpath(".//form[@id = 'checkboxes']/input[2]");

    /**
     * Retrieves the first checkbox element.
     *
     * @return WebElement representing the first checkbox.
     */
    public WebElement getFirstCheckbox() {
        return driver.findElement(CHECKBOX_1);
    }

    /**
     * Retrieves the second checkbox element.
     *
     * @return WebElement representing the second checkbox.
     */
    public WebElement getSecondCheckbox() {
        return driver.findElement(CHECKBOX_2);
    }

    /**
     * Selects a checkbox based on the provided enum value.
     *
     * @param checkbox the checkbox to select (FIRST or SECOND).
     */
    public void selectCheckbox(Checkbox checkbox) {
        switch (checkbox) {
            case FIRST:
                select(getFirstCheckbox());
                break;
            case SECOND:
                select(getSecondCheckbox());
                break;
        }
    }

    private void select(WebElement checkboxElement) {
        if (!checkboxElement.isSelected()) {
            checkboxElement.click();
        }
    }

    /**
     * Enum to represent the checkboxes on the page.
     */
    public enum Checkbox {
        FIRST, SECOND
    }
}
