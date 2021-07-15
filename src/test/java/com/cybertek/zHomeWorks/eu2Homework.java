package com.cybertek.zHomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class eu2Homework {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    //  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.cssSelector("a[href='/registration_form']")).click();

        Thread.sleep(3000);

        WebElement eng = driver.findElement(By.cssSelector("input[name='birthday']"));
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);",eng);

        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("wrong_dob");
        Thread.sleep(3000);

        String expectedWarning = "The date of birth is not valid";

        String actualWarning = driver.findElement(By.cssSelector("small[data-bv-validator='date']")).getText();

        Assert.assertEquals(actualWarning, expectedWarning, "verify that warning message ... ");





    }
}
