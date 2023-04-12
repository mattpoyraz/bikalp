package com.bikalp.newseleniumlifeproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum7n7n7 //Alert Accept
{
    public static void main( String[] args ) throws InterruptedException
    {
        String name="ismet";

        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        //Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        driver.close();
        
        
        
    }
}
