package com.cucumber.junit.webelement;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Command;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.HoverOptions;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.files.FileFilter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

@Slf4j
public class DecoratedElement implements SelenideElement {

    private SelenideElement selenideElement;

    public DecoratedElement(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
    }

    @Override
    public void click() {
        selenideElement.click();
        log.info(String.format("Clicked on %s element", selenideElement));
    }

    @Nonnull
    @Override
    public SelenideElement contextClick() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement doubleClick() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement hover() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement hover(HoverOptions options) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement dragAndDropTo(String targetCssSelector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement dragAndDropTo(WebElement target) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement dragAndDropTo(String targetCssSelector, DragAndDropOptions options) {
        return null;
    }

    @Override
    public <ReturnType> ReturnType execute(Command<ReturnType> command) {
        return null;
    }

    @Override
    public <ReturnType> ReturnType execute(Command<ReturnType> command, Duration timeout) {
        return null;
    }

    @Override
    public boolean isImage() {
        return false;
    }

    @Nullable
    @Override
    public File screenshot() {
        return null;
    }

    @Nullable
    @Override
    public BufferedImage screenshotAsImage() {
        return null;
    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String name) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Nonnull
    @Override
    public SelenideElement setValue(@Nullable String text) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement val(@Nullable String text) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement append(String text) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement pressEnter() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement pressTab() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement pressEscape() {
        return null;
    }

    @Override
    public String getText() {
        log.info(String.format("Getting text from element %s", selenideElement));
        return selenideElement.getText();
    }

    @Nullable
    @Override
    public String getAlias() {
        return null;
    }

    @Nonnull
    @Override
    public String text() {
        return null;
    }

    @Nonnull
    @Override
    public String getOwnText() {
        return null;
    }

    @Nonnull
    @Override
    public String innerText() {
        return null;
    }

    @Nonnull
    @Override
    public String innerHtml() {
        return null;
    }

    @Nullable
    @Override
    public String attr(String attributeName) {
        return null;
    }

    @Nullable
    @Override
    public String name() {
        return null;
    }

    @Nullable
    @Override
    public String val() {
        return null;
    }

    @Nullable
    @Override
    public String getValue() {
        return null;
    }

    @Nonnull
    @Override
    public String pseudo(String pseudoElementName, String propertyName) {
        return null;
    }

    @Nonnull
    @Override
    public String pseudo(String pseudoElementName) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement selectRadio(String value) {
        return null;
    }

    @Nullable
    @Override
    public String data(String dataAttributeName) {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public boolean is(Condition condition) {
        return false;
    }

    @Override
    public boolean has(Condition condition) {
        return false;
    }

    @Nonnull
    @Override
    public SelenideElement setSelected(boolean selected) {
        return null;
    }

    @Nonnull
    @Override
    public DecoratedElement should(Condition... condition) {
        log.info(String.format("Check %s for condition", selenideElement));
        selenideElement.should(condition);
        return this;
    }

    @Nonnull
    @Override
    public SelenideElement should(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldHave(Condition... condition) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldHave(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldBe(Condition... condition) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldBe(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNot(Condition... condition) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNot(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNotHave(Condition... condition) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNotHave(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNotBe(Condition... condition) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement shouldNotBe(Condition condition, Duration timeout) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement as(String alias) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement parent() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement sibling(int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement preceding(int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement lastChild() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement ancestor(String selector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement ancestor(String selector, int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement closest(String selector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement find(String cssSelector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement find(String cssSelector, int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement find(By selector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement find(By selector, int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement $(String cssSelector) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement $(String cssSelector, int index) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement $(By selector) {
        return this;
    }

    @Nonnull
    @Override
    public SelenideElement $(By selector, int index) {
        return null;
    }

    @Nonnull
    @Override
    public DecoratedElement $x(String xpath) {
        selenideElement.$x(xpath);
        return this;
    }

    @Nonnull
    @Override
    public SelenideElement $x(String xpath, int index) {
        return null;
    }

    @Nonnull
    @Override
    public ElementsCollection findAll(String cssSelector) {
        return null;
    }

    @Nonnull
    @Override
    public ElementsCollection findAll(By selector) {
        return null;
    }

    @Nonnull
    @Override
    public ElementsCollection $$(String cssSelector) {
        log.info("Get collection of elements");
        return selenideElement.$$(cssSelector);
    }

    @Nonnull
    @Override
    public ElementsCollection $$(By selector) {
        return null;
    }

    @Nonnull
    @Override
    public ElementsCollection $$x(String xpath) {
        return null;
    }

    @Nonnull
    @Override
    public File uploadFromClasspath(String... fileName) {
        return null;
    }

    @Nonnull
    @Override
    public File uploadFile(File... file) {
        return null;
    }

    @Override
    public void selectOption(int... index) {

    }

    @Override
    public void selectOption(String... text) {

    }

    @Override
    public void selectOptionContainingText(String text) {

    }

    @Override
    public void selectOptionByValue(String... value) {

    }

    @Nonnull
    @Override
    public SelenideElement getSelectedOption() throws NoSuchElementException {
        return null;
    }

    @Nonnull
    @Override
    public ElementsCollection getSelectedOptions() {
        return null;
    }

    @Nullable
    @Override
    public String getSelectedValue() {
        return null;
    }

    @Nonnull
    @Override
    public String getSelectedText() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement scrollTo() {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement scrollIntoView(boolean alignToTop) {
        return null;
    }

    @Nonnull
    @Override
    public SelenideElement scrollIntoView(String scrollIntoViewOptions) {
        return null;
    }

    @Nonnull
    @Override
    public File download() throws FileNotFoundException {
        return null;
    }

    @Nonnull
    @Override
    public File download(long timeout) throws FileNotFoundException {
        return null;
    }

    @Nonnull
    @Override
    public File download(FileFilter fileFilter) throws FileNotFoundException {
        return null;
    }

    @Nonnull
    @Override
    public File download(long timeout, FileFilter fileFilter) throws FileNotFoundException {
        return null;
    }

    @Nonnull
    @Override
    public File download(DownloadOptions options) throws FileNotFoundException {
        return null;
    }

    @Nonnull
    @Override
    public String getSearchCriteria() {
        return null;
    }

    @Nonnull
    @Override
    public WebElement toWebElement() {
        return null;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String propertyName) {
        return null;
    }

    @Override
    public boolean exists() {
        return false;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }

    @Override
    public WebDriver getWrappedDriver() {
        return null;
    }

    @Override
    public WebElement getWrappedElement() {
        return null;
    }

    @Override
    public void click(ClickOptions clickOption) {

    }

    @Override
    public Coordinates getCoordinates() {
        return null;
    }

}
