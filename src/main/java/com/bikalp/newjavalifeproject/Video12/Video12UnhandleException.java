package com.bikalp.newjavalifeproject.Video12;



public class Video12UnhandleException //class
{
    public static void main( String[] args ) //main method
    {
      
       int a=10;  //ArithmeticException


       try{
        System.out.println(a);
       }
       catch (ArithmeticException e)  {
        //catch (NullPointerException e)  {
        //catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println(e.getMessage());
       }
       finally{

        System.out.println("hey I am always in the console");
       }
      

     
   


        


        
    }
}
