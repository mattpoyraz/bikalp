package com.bikalp.newjavalifeproject.Video13;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Video13HashMap //class
{
    public static void main( String[] args ) //main method
    {

      HashMap <Integer,String> list=new HashMap<Integer,String>();

      list.put(100, "ismet");
      list.put(10, "poyraz");
      list.put(542654,"Gaziantep");

      System.out.println(list);

      for (Map.Entry m: list.entrySet()){

            m.getKey();
            m.getValue();

            System.out.println(m.getKey()+":"+m.getValue());
}

      list.remove(100);
      System.out.println(list);




    }

        
    }

