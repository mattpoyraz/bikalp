package com.bikalp.newseleniumlifeproject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum7n7 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for (WebElement option : options ){

            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }

       

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        
        
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
      

        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("Style").contains("0.5")){

            System.out.println("its Disabled");
            Assert.assertTrue(true);

        }

        else{
            System.out.println("its enabled");
        }




        



        
       
        driver.close();
        
        
    }
}
