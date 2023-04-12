package com.bikalp.newseleniumlifeproject;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum11
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver= driver.findElement(By.cssSelector("#gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        
        WebElement columnDriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());
    
        for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++){

            String clinkLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);

            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clinkLinkTab);

        }
            Thread.sleep(5000);
            Set<String> abc=driver.getWindowHandles();
            Iterator<String> it=abc.iterator();

            while(it.hasNext()){

                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }
            driver.quit();

        }
        
    
    
    
    }

