package com.the_internet.herokuapp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest {
    WebDriver driver;
    @Test
    public void thirdTest() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[5]/a")).click();
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[2]
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[3]
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[4]
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[5]
        //*[@id="content"]/div/div/div/div[2]/table/tbody/tr[1]/td[6]

        String before_xpath = "//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td[";
        String after_xpath = "1]";



        for (int i=1; i<=6; i++){
                String name =   driver.findElement(By.xpath("before_xpath+i+after_xpath")).getText();
                System.out.println(name);






            }











    }
}
