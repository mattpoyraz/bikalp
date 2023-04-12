package com.bikalp.newseleniumlifeproject;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum13n13 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        
        WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("ismet");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //screen shot

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("D:\\herşey\\screenshot.png"));


         //broken link
        SoftAssert softAssert= new SoftAssert();

        
        List<WebElement>links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        
        for(WebElement link : links){

        String url=link.getAttribute("href");

        HttpURLConnection connection= (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int respCode=connection.getResponseCode();

        System.out.println(respCode);
        softAssert.assertTrue(respCode<400, "The link with name : "+link.getText()+" is broken with code : "+respCode);
        
        /* 
        if ( respCode>400){

            System.out.println("The link with name : "+link.getText()+" is broken with code : "+respCode);
            Assert.assertTrue(false);
        }
        */
       
        }
        softAssert.assertAll();

        
    }
}
