package com.cybertek.Assignments.practiceHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6_MailRecieve {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://www.fakemail.net/");
        String email = driver.findElement(By.xpath("//span[@id='email']")).getText();
        System.out.println(email);

        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("MikeSmith");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();
        Thread.sleep(3000);
        String ActualSignUpMessage = driver.findElement(By.xpath("//h3[@name='signup_message']")).getText();
        Thread.sleep(3000);
        String ExpectedSignUpMessage= "Thank you for signing up. Click the button below to return to the home page.";

        Assert.assertEquals(ActualSignUpMessage,ExpectedSignUpMessage,"Verify Email Signup message");


        driver.get("https://practice-cybertekschool.herokuapp.com/signup_confirmation");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();

       WebElement NewRecievedMail= driver.findElement(By.cssSelector("td.from"));

        String ActualEmailFrom= NewRecievedMail.getText();
        String ExpectedEmailForum= " do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(ActualEmailFrom,ExpectedEmailForum,"Verify mail RecievedMessage");

        NewRecievedMail.click();

        WebElement MailSource = driver.findElement(By.xpath("//span[@id='odesilatel']"));
        String ActualMailSource = MailSource.getText();
        String ExpectedMailSource= "do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(ActualMailSource,ExpectedMailSource,"Verify mailAdress");


        WebElement MailSubject = driver.findElement(By.xpath("//span[@id='predmet']"));
        String ActualMailSubject = MailSubject.getText();
        String ExpectedMailSubject= "Thanks for subscribing to practice.cybertekschool.com!";
        Assert.assertEquals(ActualMailSubject,ExpectedMailSubject,"Verify mailSubject");


    }
}