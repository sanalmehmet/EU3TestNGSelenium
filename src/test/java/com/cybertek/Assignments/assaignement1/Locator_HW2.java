package com.cybertek.Assignments.assaignement1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_HW2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement HomeButton= driver.findElement(By.xpath("//li/a"));
        ///html/body/nav/ul/li/a

        System.out.println("Text of Home Button= "+ HomeButton.getText());

        /////////
        Thread.sleep(3000);
        WebElement ForgatPassword= driver.findElement(By.xpath("//div/h2"));
        // /html/body/div/div[2]/div[1]/div[1]/h2
        System.out.println("Text of Forgot Password= "+ ForgatPassword.getText());

        /////////
       Thread.sleep(3000);
       WebElement EmailText= driver.findElement(By.xpath("//div/label"));
       // /html/body/div/div[2]/div/div/form/div/div/label

       System.out.println("Text of Email= "+ EmailText.getText());
       /////////
        Thread.sleep(3000);
        WebElement EmailInputBox= driver.findElement(By.xpath("//div/input"));
        //  /html/body/div/div[2]/div/div/form/div/div/input

        EmailInputBox.sendKeys("mike@smith.com");

        String EmailInput= EmailInputBox.getAttribute("value");
        System.out.println("EmailInput= "+ EmailInput);

        //////
        Thread.sleep(3000);
        WebElement RetrievePassword= driver.findElement(By.xpath("(//i)"));
        // /html/body/div/div[2]/div/div/form/button
        System.out.println("Text of Retrieve Password= "+ RetrievePassword.getText());
    }
}