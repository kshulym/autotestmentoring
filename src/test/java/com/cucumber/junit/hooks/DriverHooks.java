package com.cucumber.junit.hooks;

import com.cucumber.junit.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.SneakyThrows;


public class DriverHooks {

    @SneakyThrows
    @Before
    public void setupDriver(){
        DriverManager.setupDriver();
    }

    @After
    public void quitDriver(){
        DriverManager.quitDriver();
    }

}
