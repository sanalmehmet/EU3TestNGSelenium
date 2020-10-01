package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) throws InterruptedException {

      //task open chrome and navigate to  http://practice.cybertekschool.com

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.navigate().to("http://practice.cybertekschool.com");


        //getting TITLE in the browser with selenium--we use for verificitation in testing
        //shortcut for creating variable
        //Alt+Enter
        String title = driver.getTitle();

        //shortcut--soutv    to print variable name and value
        // System.out.println("titel= "+title);
        System.out.println("title = " + title);

       //getCurrentUrl--printing url from the browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //getpagesource--- gets the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);


    }
}
