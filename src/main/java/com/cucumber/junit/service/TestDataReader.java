package com.cucumber.junit.service;

import java.util.ResourceBundle;

public class TestDataReader {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("common");

    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}
