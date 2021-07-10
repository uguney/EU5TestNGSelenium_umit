package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class starting {

    public static void startWithUrl(String url) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get(url);
    }

}
