package com.bikalp.newseleniumlifeproject;


import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bolum13 
{
    private static final boolean True = false;

    public static void main( String[] args ) throws InterruptedException
    {
        
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options= new ChromeOptions();
        Proxy proxy= new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        options.setCapability("proxy", proxy);


        options.setAcceptInsecureCerts(True);
	    WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        driver.close();
        
        
        
    }
}
