package com.cucumber.junit.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class DocsPage {
    private static final String PAGE_TITLE = "//div[@class='page-header']/*[contains(text(), '%s')]";

    public void isPageTitleDisplayed(String text) {
        $x(String.format(PAGE_TITLE, text)).should(Condition.exist)
                .should(Condition.visible);
    }
}
