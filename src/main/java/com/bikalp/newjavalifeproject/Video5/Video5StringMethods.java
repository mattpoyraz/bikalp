package com.bikalp.newjavalifeproject;




public class Video5StringMethods 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //Number of Character string

        String s="Welcome";

        System.out.println(s.length());

        //Concatenation

        String s1="Ismet to :";
        String s2=" America";
        
        /* 
        s1.concat(s2);
        s1+s2;
        "Ismet to :".concat(" America");
        "ismet to :"+" America";
        */
        System.out.println(s1.concat(s2));

        //Equals

        String s3="Welcome";
        String s4="welcome";
        
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        //Contains

        System.out.println(s3.contains("Wel"));

        //Substring

        System.out.println(s3.substring(0,5));
        System.out.println(s3.substring(1,4));
        System.out.println(s3.substring(2,6));

        //Replace

        System.out.println(s3.replace("Wel", "Upa"));
        System.out.println(s3.replace("W", "U"));
    }
}
