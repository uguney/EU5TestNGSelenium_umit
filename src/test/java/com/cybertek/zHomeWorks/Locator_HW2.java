package com.cybertek.zHomeWorks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locator_HW2 {
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password Links to an external site.
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
   a. “Home” link
   b. “Forgot password” header
   c. “E-mail” text
   d. E-mail input box
   e. “Retrieve password” button
4.Print text of a,b,c,e and put some email to d
 */

    @Test
    public void HW2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//ul[@class='navbar-nav']/..//a")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

        String forgotPassword = driver.findElement(By.xpath("//h2[contains(.,'ot Password')]")).getText();
        System.out.println("forgotPassword = " + forgotPassword);

        String emailTitle = driver.findElement(By.xpath("//label[@for='email']")).getText();
        System.out.println("emailTitle = " + emailTitle);

        driver.findElement(By.xpath("//input[starts-with(@pattern,'[a-z0-9')]")).sendKeys("guney@cybertekschool.com");
        Thread.sleep(1000);
        String emailBox = driver.findElement(By.xpath("//input[starts-with(@pattern,'[a-z0-9')]")).getAttribute("value");
        Thread.sleep(1000);
        System.out.println("emailBox = " + emailBox);

        driver.findElement(By.xpath("//i[contains(.,'Retrieve')]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        String part1 = driver.findElement(By.xpath("//div[@id='page-footer']/div/div")).getText();
        System.out.println("part1 = " + part1);

        driver.quit();






    }



}
