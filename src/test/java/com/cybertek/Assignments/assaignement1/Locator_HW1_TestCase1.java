package com.cybertek.Assignments.assaignement1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_HW1_TestCase1 {

    public static void main(String[] args) {
        /*Test case 1
        Go to Ebay
        enter search term
        click on search button
        print number of results*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement search= driver.findElement(By.xpath("//input[@type='text']"));

        search.sendKeys("book");
        WebElement searchButton= driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        WebElement finalResult=driver.findElement(By.xpath("//h1/span"));

        String actualResult= finalResult.getText();
        System.out.println(actualResult);

        driver.quit();

    }
}
