package com.bikalp.newseleniumlifeproject;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum9n9


{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div[id='start'] button")).click();
        
        Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebDriverWait w= new WebDriverWait(driver, 10);
        System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated
        (By.xpath("//h4[text()='Hello World!']"))));
        
        WebElement foW= wait.until(new Function<WebDriver,WebElement>() {
            
            public WebElement apply (WebDriver driver){

                if (driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed()){
                    
                    return driver.findElement(By.xpath("//h4[text()='Hello World!']"));
                }
                else{
                    return null;
                }
               
            }
        });

        System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
        
        
        
    }
}
