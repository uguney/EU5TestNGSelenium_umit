package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }



    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

    @Test
    public void secondImage() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement secondImage = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));

        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.moveToElement(secondImage).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//h5[.='name: user2']")).isDisplayed(), "verify user2 is displayed");


    }

    @Test
    public void imageDynamic() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 1; i <= 3; i++) {

            WebElement Images = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + i + "]"));

            Actions act = new Actions(driver);
            Thread.sleep(2000);
            act.moveToElement(Images).perform();

            Assert.assertTrue(driver.findElement(By.xpath("//h5[.='name: user" + i + "']")).isDisplayed(), "verify user " + i + " is displayed");

        }

    }


}