package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aa3 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedEmail= "mike@smith.com";

        WebElement emailInputBox=driver.findElement(By.name("email"));
        emailInputBox.sendKeys(expectedEmail);

        String actualEmail = emailInputBox.getAttribute("value");

        System.out.println("actualemail= "+ actualEmail);

        if (expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        WebElement retrievePasswor= driver.findElement(By.id("form_submit"));
        retrievePasswor.click();

        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));

        System.out.println(actualConfirmationMessage.getText());

        String expectedMessage= "Your e-mail's been sent!";

        String acttualMessage= actualConfirmationMessage.getText();

        if (expectedMessage.equals(acttualMessage)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.quit();


    }
}
