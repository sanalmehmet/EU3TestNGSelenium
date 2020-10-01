package com.cybertek.Assignments.assaignement2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignement2 {

    @Test
    public void Test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement CheckBox = driver.findElement(By.cssSelector("#check1"));

        Assert.assertEquals("Check All","Check All");

        CheckBox.click();

        WebElement option1= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement option2= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        WebElement option3= driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        WebElement option4= driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));

        Assert.assertTrue(option1.isSelected(),"verify that option1 is selected");
        Assert.assertTrue(option2.isSelected(),"verify that option2 is selected");
        Assert.assertTrue(option3.isSelected(),"verify that option3 is selected");
        Assert.assertTrue(option4.isSelected(),"verify that option4 is selected");

        Thread.sleep(3000);

        Assert.assertEquals("Uncheck All","Uncheck All");


        driver.quit();
    }

}
