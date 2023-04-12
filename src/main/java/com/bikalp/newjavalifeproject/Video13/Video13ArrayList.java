package com.bikalp.newjavalifeproject.Video13;


import java.util.ArrayList;

public class Video13ArrayList //class
{
    public static void main( String[] args ) //main method
    {

      /* 
      ArrayList<String> list=new ArrayList<String>();
      list.add("ismet");
      list.add("poyraz");
      list.add("1213");

      
      System.out.println(list.size());

      for ( String i : list){

        System.out.println(i);
     
      }
      */

      ArrayList list2= new ArrayList<>();
    {
      list2.add("Hello");
      list2.add(6546);
      list2.add(132.654);
      list2.add('C');

      System.out.println(list2);

      list2.remove("Hello");
      list2.remove(1);

      System.out.println(list2);

      list2.add(0, "HELLO");
      list2.add(0,"I am first");

      System.out.println(list2);


    }

        
    }
}
