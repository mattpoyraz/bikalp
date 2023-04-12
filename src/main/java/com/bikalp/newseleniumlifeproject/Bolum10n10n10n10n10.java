package com.bikalp.newseleniumlifeproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum10n10n10n10n10 //drag and drop
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);

        Actions action=new Actions(driver);
        WebElement source=driver.findElement((By.id("draggable")));
        WebElement target=driver.findElement((By.id("droppable")));
        action.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
        driver.close();

        
        
        
        
    }
}
