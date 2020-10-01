package com.cybertek.tests.day3_webelement_intro;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aa2 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputBox= driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@cybertek.com");

        WebElement retrieveButton= driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sents";


        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedUrl= "+expectedUrl);
            System.out.println("actual Url "+actualUrl);



        }
driver.quit();

    }
}
