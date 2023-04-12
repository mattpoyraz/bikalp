package com.bikalp.newjavalifeproject;

interface TestInterFace {

    int a=10;
    void m1();

}

interface TestInterFace2 {

    int b=20;
    void m2();

}





public class Video10Interface implements TestInterFace, TestInterFace2
{
    
    
    public void m1(){

        System.out.println(a+b);
    }
    public void m2(){

        System.out.println(b);
    }

    
    public static void main( String[] args ) //main method
    {

        Video10Interface intd= new Video10Interface();

        intd.m1();
        intd.m2();
       
       
        
    }
}
