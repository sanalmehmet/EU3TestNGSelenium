package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
       /* Verify confirmation message
        -open browser
        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        -enter any email
        -verify that email is displayed in the input box
        -click on Retrieve password
       - verify that confirmation message says ‘Your e-mail’s been sent!’*/

        //open browser chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //goto webpage
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //entry any email___ we use name attribute here because there is no id for email

        WebElement emailInputBox= driver.findElement(By.name("email"));

        String expectedEmail="mike@smith.com";

        //sendkeys___send keybord action to the webelement
        emailInputBox.sendKeys("mike@smith.com");


        //verify that email is displayed in the input box
        //somehow we should get task from webelement..two ways
        //1/getText()__it will return string dont work in box it works 99%
        //2_getAttribute("Value") second way of getting text aspacially input boxes

        String actualEmail= emailInputBox.getAttribute("value");
        System.out.println("actualEmail "+ actualEmail);
        //erify that confirmation message says ‘Your e-mail’s been sent

        if (expectedEmail.equals(actualEmail)){
            System.out.println("Pass");

        }else{
            System.out.println("Pass");
        }

        //click on retrieve password

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //verify that confirmation message says ‘Your e-mail’s been sent!
        WebElement actualConfirmationMessage= driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmationMessage.getText());   // yaziyigormek icin yazdiriyorum. getText ile

        //save expected message
        String expectedMessage = "Your e-mail's been sent!";
        //save actual message to variable
        String actualMessage = actualConfirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        //close browser
        driver.quit();

    }
}
