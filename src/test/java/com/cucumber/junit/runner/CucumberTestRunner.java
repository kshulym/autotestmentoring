package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report",
                "json:target/cucumber-reports/CucumberReports.json",
                "junit:target/cucumber-reports/CucumberReports.xml"},
        monochrome = true,
        tags = "",
        glue = "com.cucumber.junit",
        features = "src/test/resources/features"
)
public class CucumberTestRunner {
}
