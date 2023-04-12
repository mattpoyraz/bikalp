package com.bikalp.newjavalifeproject;



public class Video6OpsN6 //class
{

    int a;
    int b;


    /* 
    void sum(int x, int y){

        a=x;
        b=y;
        System.out.println(x+y);
    }
*/

    int sum2(){
        return(a+b);
    }


    public static void main( String[] args ) //main method
    {
        /* 
        Video6OpsN6 sum1=new Video6OpsN6();
        sum1.sum(100, 200);
        */

        Video6OpsN6 sumNUM= new Video6OpsN6();
        sumNUM.a=100;
        sumNUM.b=200;
        int total= sumNUM.sum2();
        System.out.println(total);
        
    }
}
