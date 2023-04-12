package com.bikalp.newseleniumlifeproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum6 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String name="ismet";
        String password1 = getPassword(driver);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password1);
        Thread.sleep(3000);
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String logInText=driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(logInText, "You are successfully logged in.");
        
        String element1=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
        Assert.assertEquals(element1, "Hello "+name+",");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();


}
    
    public static String getPassword(WebDriver driver) throws InterruptedException{

    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String passwordText = driver.findElement(By.cssSelector("form p")).getText();
    String[] passwordArray = passwordText.split("'");
    String password = passwordArray[1].split("'")[0];
    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
    return password;
        

            }
}