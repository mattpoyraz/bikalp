package com.bikalp.newjavalifeproject;



public class Video4ArrayConcepts //class
{
    public static void main( String[] args ) //main method
    {
      
        // integer Array
        /*  
        int a[]= new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;

        //Int a[]={10,20,30};

        //System.out.println(a[2]);
        
        for (int i=0; i<3; i++){

            System.out.println(a[i]);
        }
        
        
        int sum=0;
        for (int i:a){

            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("All the integar total : "+sum);
        */
        

        // String Array

        /* 
        String a[]= new String[3];
        a[0]="Welcome";
        a[1]="Ismet";
        a[2]="Poyraz";
        
        //String a[]={"Welcom","Ismet","Poyraz"};

        System.out.println(a.length);

        for(String i:a ){

            System.out.println(i);
            System.out.println(i.length());
        }
        */

        Object a[]=new Object[3];
         
        a[0]='A';
        a[1]="Welcome";
        a[2]=500;
        
        //Object a[]={'A',500,"Welcome"};
        for (Object i:a) {

            System.out.println(i);
        }
        
    }
}
