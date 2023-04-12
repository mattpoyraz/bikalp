package com.bikalp.newseleniumlifeproject;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum2 //BOLUM 2
{
    public static void main( String[] args )
    {
        
        //WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

		driver.get("https://www.rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    
        
    }
}
