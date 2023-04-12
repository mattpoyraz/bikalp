package com.bikalp.newjavalifeproject;



public class Video8StaticKeyword //class
{

    int a;
    static int b;

    void demo1(){
        //a=100;
        //b=500;
        //demo2();
        //demo1();

        System.out.println("ismet");
    }

    static void demo2(){

        System.out.println("poyraz");
    }




    public static void main( String[] args ) //main method
    {

        
        b=500;
        demo2();

        Video8StaticKeyword values=new Video8StaticKeyword();        
        values.demo1();
        

        System.out.println(b);
        
        
    }
}
