package com.cybertek.Assignments.practiceHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase1and5 {

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
    public void test1() {
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");

        WebElement WarningMessage = driver.findElement(By.xpath("//*[text()='The date of birth is not valid']"));

        String ActualResult = WarningMessage.getText();

        String ExpectedResult = "The date of birth is not valid";

        Assert.assertEquals(ActualResult, ExpectedResult, "Verify message: 'The date of birth is not valid'");

    }

    @Test
    public void test2() {


        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        WebElement CplusBox = driver.findElement(By.cssSelector("#inlineCheckbox1"));
        WebElement JavaBox = driver.findElement(By.cssSelector("#inlineCheckbox2"));
        WebElement JavaScript = driver.findElement(By.cssSelector("#inlineCheckbox3"));

        Assert.assertTrue(CplusBox.isDisplayed(), "verify C++ is displayed");
        Assert.assertTrue(JavaBox.isDisplayed(), "verify Java is displayed");
        Assert.assertTrue(JavaScript.isDisplayed(), "verify JavaScript is displayed");


    }

    @Test
    public void test3() {

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");

        WebElement WarningMessage = driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']"));

        Assert.assertTrue(WarningMessage.isDisplayed(), "Verify warning message: first name must be more than 2 and less than 64\n" +
                "characters long");

    }

    @Test
    public void test4() {

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("a");

        WebElement WarningMessage = driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']"));

        Assert.assertTrue(WarningMessage.isDisplayed(), "Verify warning message: The last name must be more than 2 and less than 64\n" +
                "characters long");


    }

    @Test
    public void test5() {

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mike");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Smith");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mikesmith66");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mike@smith.com");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ms123456");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("571-000-0000");

        driver.findElement(By.xpath("//input[@value='male']")).click();

        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("01/01/1995");


        WebElement drp = driver.findElement(By.xpath("//select[@name='department']"));
        drp.click();
        Select selectdrp = new Select(drp);
        selectdrp.selectByValue("DE");

        WebElement Jobdrop = driver.findElement(By.xpath("//select[@name='department']"));
        Jobdrop.click();
        Select selectJobdrop = new Select(Jobdrop);

        selectJobdrop.selectByIndex(3);

        driver.findElement(By.cssSelector("#inlineCheckbox1")).isSelected();

        driver.findElement(By.cssSelector("#wooden_spoon")).click();


        WebElement Register = driver.findElement(By.xpath("//div[@role='alert']/p"));

        String ActualResult = Register.getText();

        String ExpectedResult = "You've successfully completed registration!";

        Assert.assertEquals(ActualResult, ExpectedResult, "Verify message: 'You've successfully completed registration!'");

    }
}