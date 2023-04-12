package com.bikalp.newseleniumlifeproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum5n6 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("31321");
        driver.findElement(By.className("signInBtn")).click();
        //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ismet");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("iso@gmail.com");
        //driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("654654");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        Thread.sleep(3000);
        //System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxTwo")).click();
        //driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.close(); */
    
        
    }
}
