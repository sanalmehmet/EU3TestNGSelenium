package com.cybertek.Random;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon_random {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com/");

        WebElement serchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        serchbox.sendKeys("selenium");

        WebElement searchbutton= driver.findElement(By.xpath("//input[@value='Go']"));
        searchbutton.click();
    }
}
