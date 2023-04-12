package com.bikalp.newseleniumlifeproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Bolum16n16 //testNG
{
    @AfterSuite    
    public void afterSuite(){
        
        System.out.println("afterSuite");   
        
    }
    @BeforeMethod    
    public void beforeMethod(){
        
        System.out.println("beforeMethod");   
        
    }
    @BeforeTest    
    public void beforeTest(){
        
        System.out.println("before test");   
        
    }
    @BeforeSuite    
    public void beforeSuite(){
        
        System.out.println("beforeSuite");   
        
    }
    @AfterTest    
    public void afterTest(){
        
        System.out.println("After test");   
        
    }
    @Test(groups ={"Smoke"})   
    public void fireLoginHomeDepartmen(){
        
        System.out.println("i am coming fire");   
        
    }
    @Test(groups ={"Smoke"})     
    public void policeLoginHomeDepartmen(){
        
        System.out.println("i am coming police");   
        
    }

    @BeforeMethod    
    public void BeforeMethod(){
        
        System.out.println("beforeMethod");   
        
    }
    @AfterMethod    
    public void AfterMethod(){
        
        System.out.println("afterMethod");   
        
    }
    @AfterMethod    
    public void afterMethod(){
        
        System.out.println("afterMethod");   
        
    }

}
