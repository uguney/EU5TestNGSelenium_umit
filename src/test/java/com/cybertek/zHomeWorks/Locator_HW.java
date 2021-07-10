package com.cybertek.zHomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locator_HW {

/*
Test case 1
Go to Ebay
enter search term
click on search button
print number of results
 */
    @Test
public void tc1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("navigation");
        driver.findElement(By.cssSelector("input#gh-btn")).click();
        String text = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span[1]")).getText();
        System.out.println("Number of results = " + text);

        driver.quit();


    }

    /*
    Test case 2
Go to Ebay
search Selenium
click on search button
verify title contains Selenium
     */
    @Test

    public void tc2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        String str = "selenium";

        driver.findElement(By.id("gh-ac")).sendKeys("selenium");
        driver.findElement(By.id("gh-btn")).click();
        String title = driver.getTitle();

        Assert.assertEquals(title.contains(str), true);

        driver.quit();


    }
/*
Test case 3
Go to wikipedia.org (Links to an external site.)
enter search term `selenium webdriver`
click on search button
click on search result `Selenium (software)`
verify url ends with `Selenium_(software)'
 */

    @Test
    public void tc3() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.xpath("//label[@for='searchInput']/../input")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button/i[@data-jsl10n='search-input-button']")).click();
        driver.findElement(By.cssSelector("a[href='/wiki/Selenium_(software)']")).click();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(currentUrl.endsWith("Selenium_(software)"), true);

        driver.quit();
    }


}
