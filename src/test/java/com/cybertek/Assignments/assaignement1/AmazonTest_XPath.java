package com.cybertek.Assignments.assaignement1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest_XPath {
    /* TASK * go to amazon.com * search for selenium * click search button
     * verify 1-48 of 304 results for "selenium*/

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        search.sendKeys("selenium");
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        WebElement finalResult=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        String actualResult= finalResult.getText();
        String expectedResult="1-48 of 172 results for";


        if (expectedResult.equals(actualResult)) {
            System.out.println("Pass");
            System.out.println("expectedResult ="+  expectedResult );
            System.out.println("actualResult ="+ actualResult);

        }else{
            System.out.println("Fail");
            System.out.println("expectedResult ="+ expectedResult );
            System.out.println("actualResult ="+ actualResult);

        }
        driver.quit();
    }

    }
