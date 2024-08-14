package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.section01.Ex02BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * AdvancedCheckboxPage extends the basic CheckboxPage by adding more advanced methods.
 * It demonstrates additional techniques for interacting with multiple elements.
 */
public class Ex03AdvancedCheckboxPage extends Ex02BasePage {

    private static final By CHECKBOXES = By.xpath(".//form[@id = 'checkboxes']/input");

    /**
     * Retrieves all checkbox elements as a list.
     *
     * @return a list of WebElements representing all checkboxes on the page.
     */
    public List<WebElement> getAllCheckboxes() {
        return driver.findElements(CHECKBOXES);
    }

    /**
     * Selects a checkbox by its index (1-based).
     *
     * @param index the index of the checkbox to select.
     */
    public void selectCheckboxByIndex(int index) {
        WebElement checkbox = getAllCheckboxes().get(index - 1);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    /**
     * Deselects all checkboxes.
     */
    public void deselectAllCheckboxes() {
        for (WebElement checkbox : getAllCheckboxes()) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }
}
