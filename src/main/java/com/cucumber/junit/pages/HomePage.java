package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.webelement.DecoratedElement;
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

    public DecoratedElement getMenuSection(String linkText) {
        return new DecoratedElement($(By.xpath(format(MENU_LINK_PATTERN, linkText))));
    }

    public List<String> getMenuItems() {
        return $$(By.xpath(CHILD_MENU_LINKS)).texts();
    }

    public DecoratedElement getMenuItem(String itemName) {
        return new DecoratedElement($x(String.format(CHILD_MENU_LINK_PATTERN, itemName)));
    }
}
