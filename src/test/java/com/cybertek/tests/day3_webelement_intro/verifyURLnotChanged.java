package com.cybertek.tests.day3_webelement_intro;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {
       /* Verify URL not changed
        _open browser
        _go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        _click on Retrieve password
        _verify that url did not change*/

        //open browser chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //goto webpage
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save expected URL before clicking button-we gave the name, expectedurl
        String expectedUrl= driver.getCurrentUrl();

        //click on Retrieve password( call WebElement and give a name equal=driver.findelement..
        // Write Id from HTML " String from site"
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit")); //get the place mentioned in the site
        retrievePasswordButton.click();                          // clik on retrive password

        String actualUrl= driver.getCurrentUrl();

        //verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        //close browser
        driver.quit();

    }
}
