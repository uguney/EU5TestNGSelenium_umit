package com.cybertek.tests.CounselHero;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {

        String expectedEmail = "mike@smith.com";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://counselhero.com/");
        Thread.sleep(2000);
        driver.get("https://counselhero.com/admin/login");

        Thread.sleep(2000);

        WebElement emailInputBox = driver.findElement(By.name("username"));

        emailInputBox.sendKeys("mike@smith.com");

        String actualEmail = emailInputBox.getAttribute("value");

        Thread.sleep(2000);

        WebElement passwordInputBox = driver.findElement(By.name("password"));

        passwordInputBox.sendKeys("123456");

        Thread.sleep(2000);

        driver.findElement(By.className("pix-btn")).click();




        System.out.println(expectedEmail);
        System.out.println(actualEmail);








    }
}
