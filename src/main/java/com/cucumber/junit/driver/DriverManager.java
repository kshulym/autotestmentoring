package com.cucumber.junit.driver;

import com.codeborne.selenide.WebDriverRunner;
import com.cucumber.junit.service.TestDataReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;
import java.util.Optional;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverManager {

    private static final int IMPLICIT_WAIT_TIMEOUT = 5;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager() {
    }

    public static void setupDriver() throws MalformedURLException {
        WebDriver driver = null;
        String host = System.getProperty("host");
        if ("saucelabs".equals(host)) {
            String sauceurl = TestDataReader.getTestData("saucelabs.url");
            MutableCapabilities sauceOptions = new MutableCapabilities();
            sauceOptions.setCapability("username", TestDataReader.getTestData("saucelabs.user"));
            sauceOptions.setCapability("accessKey", TestDataReader.getTestData("saucelabs.accesskey"));
            MutableCapabilities capabilities;
            switch (System.getProperty("browser")) {
                case SAFARI -> {
                    capabilities = new SafariOptions();
                    capabilities.setCapability("screenResolution", "2560x1600");
                    capabilities.setCapability("platformName", "macOS 10.12");
                }
                case FIREFOX -> {
                    capabilities = new FirefoxOptions();
                    capabilities.setCapability("platformName", "macOS 10.12");
                }
                default -> {
                    capabilities = new ChromeOptions();
                    capabilities.setCapability("platformName", "Windows 10");
                    capabilities.setCapability("browserVersion", "latest");
                }
            }
            capabilities.setCapability("sauce:options", sauceOptions);
            capabilities.setCapability("browserName", System.getProperty("browser"));
            driver = new RemoteWebDriver(new URL(sauceurl), capabilities);

        } else if ("localhost".equals(host)) {
            driver = getWebDriverByName();
        }

        Objects.requireNonNull(driver).manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
        webDriverThreadLocal.set(driver);
        WebDriverRunner.setWebDriver(driver);
    }

    private static WebDriver getWebDriverByName() {
        switch (System.getProperty("browser")) {
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
        }
    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        Optional.ofNullable(getDriver()).ifPresent(webDriver -> {
            webDriver.quit();
            webDriverThreadLocal.remove();
        });
    }
}
