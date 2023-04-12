package com.bikalp.newseleniumlifeproject;


import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum15n15 
{
    public static void main( String[] args ) throws InterruptedException
    {
        /* 
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        
        //Switching and operation on multiple  windows

        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parentWindowId= it.next();
        String childWindow= it.next();
        driver.switchTo().window(childWindow);

        //second window tab
        driver.get("https://www.google.com");
        String name= driver.findElement(By.className("name")).getText();
        driver.switchTo().window(parentWindowId);

        //new screenshot 

        File file= name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));

        // get height & Width

        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());
*/

        
    }
}
