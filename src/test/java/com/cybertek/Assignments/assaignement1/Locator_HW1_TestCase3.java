package com.cybertek.Assignments.assaignement1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_HW1_TestCase3 {

    public static void main(String[] args) {
       /* Go to wikipedia.org
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)'*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.wikipedia.org/");

        WebElement search= driver.findElement(By.id("searchInput"));
        search.sendKeys("selenium webdriver");

        WebElement searchButton= driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']"));
        //"/html/body/div[3]/form/fieldset/button"
        searchButton.click();

        WebElement searchLink= driver.findElement(By.partialLinkText("Selenium (software)"));
        searchLink.click();

        String actualUrl=driver.getCurrentUrl();

        String expectedUrl= "https://en.wikipedia.org/wiki/Selenium_(software)";



        if (actualUrl.endsWith("Selenium_(software)")) {
            System.out.println("Pass");
            System.out.println("expectedUrl= "+expectedUrl);
            System.out.println("actualUrl= "+actualUrl);
        }else{
            System.out.println("Fail");
            System.out.println("expected= "+expectedUrl);
            System.out.println("actualUrl= "+actualUrl);
        }


    }
}
