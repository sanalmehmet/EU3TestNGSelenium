package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) throws InterruptedException {

       /* Verify URL changed
        -open browser
        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        -enter any email
        -click on Retrieve password
        -verify that url changed to http://practice.cybertekschool.com/email_sent*/

        //open browser chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //goto webpage
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //entry any email___ we use name attribute here because there is no id for email

        WebElement emailInputBox= driver.findElement(By.name("email"));

        //sendkeys___send keybord action to the webelement
        emailInputBox.sendKeys("mike@smith.com");

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        Thread.sleep(3000);


        //verify that url changed to http://practice.cybertekschool.com/email_sent
        //create expectedurl

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";

        //saving actual url from browser after we enter any email and click retrieve password button
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expected= "+expectedUrl);
            System.out.println("actualUrl= "+actualUrl);
        }

        //close browser
        driver.quit();
    }
}
