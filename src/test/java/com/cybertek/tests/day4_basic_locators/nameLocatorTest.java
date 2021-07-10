package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // to make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("Mike Smith");

        // proper way
/*        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("asafmehmet@gmail.com");*/

        //lazy way
        driver.findElement(By.name("email")).sendKeys("asafmehmet@gmail.com");

        driver.findElement(By.name("wooden_spoon")).click();

/*        WebElement clickSignUpButton = driver.findElement(By.name("wooden_spoon"));

        clickSignUpButton.click();*/





    }
}
