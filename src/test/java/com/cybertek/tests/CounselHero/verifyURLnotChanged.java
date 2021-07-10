package com.cybertek.tests.CounselHero;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://counselhero.com/");

        Thread.sleep(1000);

        WebElement enrollYourSchoolButton = driver.findElement(By.linkText("Enroll Your School"));    //doesn't work
        enrollYourSchoolButton.click();




    }

}
