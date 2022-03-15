package com.cucumber.junit.pages;

import com.codeborne.selenide.SelenideElement;
import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;

import java.util.List;


import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HomePage {

    private static final String MAIN_URL = "https://cucumber.io/";
    private static final String MENU_LINK_PATTERN = "//*[contains(@class,'nav-link') and contains(text(),'%s')]";
    private static final String CHILD_MENU_LINKS = "//*[contains(@class,'menu-docs')]//*[contains(@class,'item item-al')]";
    private static final String CHILD_MENU_LINK_PATTERN = "//*[contains(@class,'menu-docs')]//*[contains(@class,'item item-al') and contains(text(),'%s')]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(MAIN_URL);
    }

    public SelenideElement getMenuSection(String linkText) {
        return $(By.xpath(format(MENU_LINK_PATTERN, linkText)));
    }

    public List<String> getMenuItems() {
        return $$(By.xpath(CHILD_MENU_LINKS)).texts();
    }

    public SelenideElement getMenuItem(String itemName) {
        return $x(String.format(CHILD_MENU_LINK_PATTERN, itemName));
    }
}
