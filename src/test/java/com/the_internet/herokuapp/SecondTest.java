package com.the_internet.herokuapp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondTest {
    @Test
    public void secondTest ( ) {
        System.setProperty ( "webdriver.chrome.driver" , "C:/Users/argadmin/Desktop/chrome/chromedriver.exe" );
        ChromeDriver driver = new ChromeDriver ();
        driver.get ( "http://the-internet.herokuapp.com/" );
        driver.findElement ( By.xpath ( "//*[@id=\"content\"]/ul/li[39]/a" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/a[1]" ) ).click ();
        WebElement element = driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/ul/li[1]/a" ) );
        Actions actions = new Actions ( driver );
        actions.moveToElement ( element );
        actions.perform ();

        if ( driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/ul/li[1]/a" ) ).isDisplayed () ) {
            System.out.println ( "design has changed" );


            driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/ul/li[1]/a" ) ).click ();
            driver.findElement ( By.xpath ( "//*[@id=\"content\"]/ul/li[39]/a" ) ).click ();
            driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/a[2]" ) ).click ();
            driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/p[3]/a" ) ).click ();

            if ( driver.findElement ( By.xpath ( "//*[@id=\"content\"]/div/p[3]/a" ) ).isDisplayed () ) {
                System.out.println ( "picture is moving" );
            }


        }


    }
}
