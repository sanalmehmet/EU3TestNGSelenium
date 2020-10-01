package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        //maximazing the webpage-fullscreen
        driver.manage().window().maximize();

       // WebElement  fullNameInput = driver.findElement(By.name("full_name"));
       // fullNameInput.sendKeys("Mike Smith");

        driver.findElement(By.name("full_name")).sendKeys("Mike Smith");

        //click full email and sign up button
       // WebElement emailInputBox= driver.findElement(By.name("email"));
        //emailInputBox.sendKeys("mikesmith@cyber.com");


        //lazy way for locate inputbax

        driver.findElement(By.name("email")).sendKeys("mikesmith@cyber.com");



        //WebElement clicksignup=driver.findElement(By.name("wooden_spoon"));
        //clicksignup.click();

        //lazy way
        driver.findElement(By.name("wooden_spoon")).click();







    }
}
