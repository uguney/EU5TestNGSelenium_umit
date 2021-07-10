package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement search = driver.findElement(By.xpath("//div[@id='nav-iss-attach']/../div[1]/input"));

        search.sendKeys("selenium");

        WebElement clickSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

        clickSearch.click();



        String part1 = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

        String part2 = driver.findElement(By.xpath("//span[contains(text(),'results for')]/../span[3]")).getText();

        String result = part1+part2;

        if(result.equalsIgnoreCase("1-48 of 300 results for \"selenium\"")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        driver.quit();










    }


}

