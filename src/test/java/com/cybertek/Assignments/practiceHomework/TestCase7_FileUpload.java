package com.cybertek.Assignments.practiceHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase7_FileUpload {

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

        driver.findElement(By.linkText("File Upload")).click();

        WebElement choosefile= driver.findElement(By.xpath("(//input[@type='file'])[1]"));

        Thread.sleep(3000);

        choosefile.sendKeys("C:/Users/mehme/Desktop/aa.txt");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        String ActualUploaded= driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        String ExpectedUploaded="File Uploaded!";
        Assert.assertEquals(ActualUploaded,ExpectedUploaded);

    }
}