package com.cybertek.Assignments.assaignement1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_HW1_TestCase2 {

    public static void main(String[] args) {
       /* Go to Ebay
        search Selenium
        click on search button
        verify title contains Selenium*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement search= driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("selenium");

        WebElement searchButton= driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        String expectedTitle= "selenium";
        String actualTitle= driver.getTitle();

        if (expectedTitle.toLowerCase().contains("selenium")) {
            System.out.println("Pass");
            System.out.println("ExpectedTitle Contains= "+expectedTitle);
            System.out.println("actualTitle= "+actualTitle);
        }else{
            System.out.println("Fail");
            System.out.println("ExpectedTitle Contains= "+expectedTitle);
            System.out.println("actualTitle= "+actualTitle);
        }
        driver.quit();

    }
}
