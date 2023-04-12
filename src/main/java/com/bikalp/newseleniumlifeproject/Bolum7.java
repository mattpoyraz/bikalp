package com.bikalp.newseleniumlifeproject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum7 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Select DropDown
        /*
        WebElement StaticDropDown=  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown= new Select(StaticDropDown);
        dropDown.selectByIndex(3);
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByVisibleText("AED");
        System.out.println(dropDown.getFirstSelectedOption().getText());
        dropDown.selectByValue("INR");
        System.out.println(dropDown.getFirstSelectedOption().getText());
        */

        //Drop Down Looping
       
        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         /*
        int i=1;
        while(i<4){
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }
        */
        
        for(int i=1; i<4; i++){
        driver.findElement(By.id("hrefIncAdt")).click();
        }
        String titleOfSelectedBox= driver.findElement(By.cssSelector("div#divpaxinfo")).getText();
        Assert.assertEquals(titleOfSelectedBox,"4 AdultS");
        
        
       /* 
        driver.findElement(By.cssSelector("input[id*='ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='CCU']")).click();
        driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
        */

        driver.close();
    }
}
