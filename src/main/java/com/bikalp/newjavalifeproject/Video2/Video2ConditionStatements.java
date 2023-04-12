package com.bikalp.newjavalifeproject;



public class Video2ConditionStatements //class
{
    public static void main( String[] args ) //main method
    {
         /*
        int vote=50;
        int age=30;

        if (vote==age){

            System.out.println("eligible to vote");
        }
        
        else{
           
            System.out.println("not eligible to vote");
        }
        */
        /* 
        if (vote<age){

            System.out.println("eligible to vode");

        }

        else if (vote==age) {

            System.out.println("Vote and age are equal");
        
        }

        else if (vote<=age) {

            System.out.println("Vote and age are not equal");
        }

        else { 

            System.out.println("none of these are condtion statements");
        }
        */
      
        int day=6;

        switch (day){

            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;

            default : System.out.println("Saturday");
        }
        
    }
}
