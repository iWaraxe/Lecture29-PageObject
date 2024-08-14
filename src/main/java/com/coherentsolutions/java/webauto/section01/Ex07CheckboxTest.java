package com.coherentsolutions.java.webauto.section01;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * CheckboxTest contains tests that validate the functionality of checkboxes on the Checkbox page.
 */
public class Ex07CheckboxTest extends Ex03BaseTest {

    private Ex06CheckboxPage checkboxPage;

    /**
     * Initializes the test by navigating to the Checkbox page.
     */
    @BeforeMethod
    public void goToCheckboxPage() {
        checkboxPage = homePage.navigateToCheckboxPage();
    }

    /**
     * Verifies that the default state of the checkboxes is as expected.
     */
    @Test
    public void checkboxDefaultConditionTest() {
        Assert.assertFalse(checkboxPage.getFirstCheckbox().isSelected());
        Assert.assertTrue(checkboxPage.getSecondCheckbox().isSelected());
    }

    /**
     * Verifies that the checkboxes can be selected correctly.
     */
    @Test
    public void selectedCheckboxTest() {
        checkboxPage.selectCheckbox(Ex06CheckboxPage.Checkbox.FIRST);
        checkboxPage.selectCheckbox(Ex06CheckboxPage.Checkbox.SECOND);
        Assert.assertTrue(checkboxPage.getFirstCheckbox().isSelected());
        Assert.assertTrue(checkboxPage.getSecondCheckbox().isSelected());
    }
}
