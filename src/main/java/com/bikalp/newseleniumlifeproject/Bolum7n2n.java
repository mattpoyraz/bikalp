package com.bikalp.newseleniumlifeproject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum7n2n 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
        //Thread.sleep(2000);
        List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for (WebElement option : options ){

            if(option.getText().equalsIgnoreCase("India")){
                option.click();
                break;
            }
        }

        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("Style").contains("0.5")){

            System.out.println("its Disabled");
            Assert.assertTrue(true);

        }

        else{
            System.out.println("its enabled");
        }

        driver.findElement(By.cssSelector("input[id*='ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
        
        driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();

        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        //Thread.sleep(2000);
        for(int i=1; i<4; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
            }

        //Thread.sleep(2000);
        WebElement StaticDropDown=  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown= new Select(StaticDropDown);
        dropDown.selectByIndex(3);
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        
        System.out.println("Congradulation");

        driver.close();

    }
}
