package com.bikalp.newseleniumlifeproject;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum10n10 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.kayak.com/");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='To?']")).click();
        driver.findElement(By.xpath("//span[text()='Los Angeles, California, United States']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        WebDriverWait w=new WebDriverWait(driver, 15);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[id='c5gRb-stops-title'] h3")));
        String title= driver.findElement(By.xpath("div[id='c5gRb-stops-title'] h3")).getText();
        Assert.assertEquals("Hello", title);
        
        
        
    }
}
