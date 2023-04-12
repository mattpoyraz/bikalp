package com.bikalp.newjavalifeproject;


class A{

    int a;
    int b;

    public void displayA(){

        System.out.println(a+b);
    }
    
}

class B extends A {

    int c;

    public void displayB(){

        System.out.println(c);
    }
    
}

class C extends B {
    int d;

    public void displayC(){

        System.out.println(d);
    }
    
}

class x {

    int getNumber(){

        return 10;
    }
}

class y extends x {

    int getNumbery(){

        return 20;
    }
}





public class Video9Inheritange //class
{
    public static void main( String[] args ) //main method
    {
       C abc= new C();
       abc.a=100;
       abc.b=500;
       abc.c=600;
       abc.d=700;

       abc.displayA();
       abc.displayB();
       abc.displayC();

        y number= new y();
        System.out.println(number.getNumber());
        System.out.println(number.getNumbery());

        
    }
}
