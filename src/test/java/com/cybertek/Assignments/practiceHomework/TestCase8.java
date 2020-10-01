package com.cybertek.Assignments.practiceHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase8 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        driver.findElement(By.linkText("Autocomplete")).click();

        driver.findElement(By.id("myCountry")).sendKeys("United States of America");

        driver.findElement(By.xpath("//input[@type='button']")).click();

        String ActualSelectedMessage = driver.findElement(By.xpath("//p[@id='result']")).getText();

        String ExpectedSelectedMessage= "You selected: United States of America";

        Assert.assertEquals(ActualSelectedMessage,ExpectedSelectedMessage);


    }
}