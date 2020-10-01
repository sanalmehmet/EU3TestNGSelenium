package com.cybertek.Assignments.assaignement2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignement1 {

    @Test
    public void Test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement CheckBox= driver.findElement(By.id("txtAge"));

        System.out.println("CheckBox.isDisplayed() = " + CheckBox.isDisplayed());

        Assert.assertFalse(CheckBox.isDisplayed(),"verify 'Success – Check box is checked' is NOT displayed");

        driver.findElement(By.id("isAgeSelected")).click();

        Assert.assertTrue(CheckBox.isDisplayed(),"verify 'Success – Check box is checked' is displayed");

        driver.quit();
    }

}
