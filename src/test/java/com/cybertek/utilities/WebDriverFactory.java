package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        switch(browserType.toLowerCase()){
            case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
            case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        }

        return driver;

    }

      /*  MY SOLUTION

    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        if(browserType.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }

        return driver;

    }*/


}
