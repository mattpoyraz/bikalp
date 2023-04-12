package com.bikalp.newseleniumlifeproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Bolum16 //testNG
{
    @Test(dependsOnMethods = {"mobilSingInHomeDepartmen","LoginHomeDepartmen"})  
    public void webLoginHomeDepartmen(){
        
        System.out.println("i am coming webLogin");   
        
    }
    @Test(groups ={"Smoke"})   
    public void mobilLoginHomeDepartmen(){
        
        System.out.println("i am coming mobile");   
        
    }
    @Test(enabled = false)
    public void mobilSingInHomeDepartmen(){
        
        System.out.println("i am coming mobile");   
        
    }
    @Test(timeOut = 4000)  
    public void LoginHomeDepartmen(){
        
        System.out.println("i am coming Login");   
        
    }
    @Parameters({"URL","API/UserName"})
    @Test
    public void PlanoHomeDepartmen(String urlname,String apiUsername){
        
        System.out.println("i am coming Plano");   
        System.out.println(urlname);
        System.out.println(apiUsername);
    }

    @Test(dataProvider = "getData")
    public void data(String username, String username2){
        System.out.println(username);
        System.out.println(username2);
    }
    @DataProvider
    public Object[][] getData(){
        
        Object[][] data=new Object[3][2];

        data[0][1]="ismet";
        data[0][2]="Poyraz";

        data[1][0]="Erkan";
        data[1][1]="Korkmaz";

        data[2][0]="Alex";
        data[2][1]="Kamie";
        return data;
    }

}
