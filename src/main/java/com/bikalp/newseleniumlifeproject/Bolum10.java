package com.bikalp.newseleniumlifeproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum10 // hover mouse onto elements
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Actions hoverMouse= new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //hoverMouse.moveToElement(driver.findElement(By.cssSelector("#icp-nav-flyout")))
        //.build().perform();
        //driver.close();

        hoverMouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown
        (Keys.SHIFT).sendKeys("ismet").build().perform();

        hoverMouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
        .doubleClick().build().perform();

        

        
        
        
    }
}
