package com.bikalp.newjavalifeproject;



public class Video3Loops //class
{
    public static void main( String[] args ) //main method
    {
      //while loop

      int a=2;

      while(a<=10){
                System.out.println("A is equal or less than 10");
                a+=2;
                
      }

      //do while loop
      int x=5;
      do{
                System.out.println("i is equal or less than 5");
                x++;
      }while(x<=10);
        
      //for loop

      for(int i=1; i<=5; i++){
                System.out.println("Hello I am back");
                
      }

      //for break Statement

        for (int c=1; c<=10; c++){

          if (c==5){
              break;
          }
          System.out.println(c);
      }

      //for countiniu Statement

      for (int u=1; u<=6; u++){

          if (u==3){
              continue;
          }
          System.out.println(u);
      }
}
}