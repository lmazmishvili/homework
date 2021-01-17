package com.the_internet.herokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    WebDriver driver;

    @Test
    public void firstTest ( ) {
        WebDriverManager.chromedriver ( ).setup ( );
        ChromeDriver driver = new ChromeDriver ( );
        driver.get ( "http://the-internet.herokuapp.com/" );
        driver.findElement ( By.xpath ( "//*[@id=\"content\"]/ul/li[18]/a" ) ).click ( );
        driver.findElement ( By.id ( "file-upload" ) ).sendKeys ( "C:\\Users\\argadmin\\IdeaProjects\\Davaleba\\src\\main\\resources\\testfolder\\levanimazmishvili.pdf" );
        driver.findElement ( By.id ( "file-submit" ) ).click ( );

        if ( driver.findElement ( By.id ( "uploaded-files" ) ).isDisplayed ( ) ) {
            System.out.println ( "good job" );



        }


    }
}
