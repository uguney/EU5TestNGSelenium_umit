package com.cybertek.zHomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.starting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckBox_HW {

    WebDriver driver;

    @Test
    public void tc2(){

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement successMessage = driver.findElement(By.cssSelector("#txtAge"));

        Assert.assertFalse(successMessage.isDisplayed(), "Verify “Success – Check box is checked” message is NOT displayed");

        WebElement isAgeSelected = driver.findElement(By.id("isAgeSelected"));

        isAgeSelected.click();

        Assert.assertTrue(successMessage.isDisplayed(), "Verify “Success – Check box is checked” message is displayed.");

    }

    @Test
    public void tc3(){

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllBtn = driver.findElement(By.xpath("//input[@id='check1']"));

        Assert.assertEquals(checkAllBtn.getAttribute("value"), "Check All");

        checkAllBtn.click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("div label>input.cb1-element"));

        for (int i = 0; i < checkboxes.size(); i++) {
            Assert.assertTrue(checkboxes.get(i).isSelected(),"Verify that every checkbox is selected");
        }

        WebElement uncheckBtn = driver.findElement(By.cssSelector("#check1"));

        Assert.assertEquals(uncheckBtn.getAttribute("value"), "Uncheck All");

    }



    @BeforeMethod
    void openBrowser(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    void closeBrowser(){
        driver.close();
    }

    @AfterClass
    void quitDriver(){
        driver.quit();
    }







}
/*
TC	#2:	SeleniumEasy	Checkbox Verification – Section	1

1. Open	Chrome	browser
2. Go	to	http://www.seleniumeasy.com/test/basic-checkbox-demo.html
3. Verify	“Success	–	Check	box	is	checked”	message	is	NOT displayed.
4. Click	to	checkbox	under	“Single	Checkbox	Demo”	section
5. Verify	“Success	–	Check	box	is	checked”	message	is displayed.


TC	#3:	SeleniumEasy	Checkbox	Verification	– Section	2

1. Open	Chrome	browser
2. Go	to	http://www.seleniumeasy.com/test/basic-checkbox-demo.html
3. Verify	“Check	All”	button	text	is	“Check	All”
4. Click	to	“Check	All”	button
5. Verify	all	check	boxes	are	checked
6. Verify	button	text	changed	to	“Uncheck	All”
 */