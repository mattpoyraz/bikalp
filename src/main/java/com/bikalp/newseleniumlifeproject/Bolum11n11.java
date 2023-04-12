package com.bikalp.newseleniumlifeproject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum11n11 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
        //Thread.sleep(5);
        driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']/label")).click();
        
    
        int count = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).size();
        System.out.println(count);

        while(! driver.findElement(By.xpath("//div[@class='DayPicker-Month']//div[@class='DayPicker-Caption']/div"))
        .getText().contains("May"))

        {
            driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        }


        for( int i=0; i<count; i++){

            String daytext=  driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).getText();
            
            
            if (daytext.equalsIgnoreCase("30")){

                driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).click();
                break;

            }

        }
        
    }
}
