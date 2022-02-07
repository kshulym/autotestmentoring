package com.cucumber.junit;

import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {

    private HomePage homePage = new HomePage();

    @Given("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user clicks on the {string} section")
    public void clickOnTheSection(String menuItemName) {
        homePage.getMenuSection(menuItemName).click();
    }

    @Then("there are {int} child menu items displayed")
    public void verifyMenuItemsDisplayed(int countOfItems) {
        homePage = null;
        assertThat(homePage.getMenuItems())
                .as("The count of menu items is not as expected")
                .hasSize(countOfItems);
    }
}
