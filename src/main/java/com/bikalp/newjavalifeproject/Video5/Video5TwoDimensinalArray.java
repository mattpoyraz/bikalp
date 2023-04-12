package com.bikalp.newjavalifeproject;



public class Video5TwoDimensinalArray //class
{
    
    public static void main( String[] args ) //main method
    {
        /* 
        int a[][]= new int[2][3];
        
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;

        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;

        */

        int a[][]={{10,20,30},{40,50,90}};

         /* 
        for(int x=0; x<=1; x++){

            for(int y=0; y<=2; y++){

                System.out.print(a[x][y]+" ");
            }

            System.out.println();
        }
        */
        
        for(int x[]:a){

            for(int i:x ){

                System.out.print(i+" ");
            }
            System.out.println();
        }

        
        
       


    }
}
