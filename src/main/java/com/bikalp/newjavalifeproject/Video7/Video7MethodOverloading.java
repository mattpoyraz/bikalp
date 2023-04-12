package com.bikalp.newjavalifeproject;



public class Video7MethodOverloading //class
{
    int a;
    int b;

    void sum(){

        a=10;
        b=100;
        System.out.println(a+b);
    }
    /* 

    void sum(int x, int y) {

        a=x;
        b=y;
        System.out.println(x+y);

    }
*/
    void sum(int a, int b) { //this key word

        this.a=a;
        this.b=b;
        System.out.println(a+b);
    
    }

    void sum(int v, double t){

        System.out.println(b-a);

    }

    void sum(int u, int h, double e){

        System.out.println(u+h+e);
    }

    

    public static void main( String[] args ) //main method
    {
       
        Video7MethodOverloading mol= new Video7MethodOverloading();
        mol.sum();
        mol.sum(10, 20, 30.5);
        mol.sum(500,100);



        
    }
}
