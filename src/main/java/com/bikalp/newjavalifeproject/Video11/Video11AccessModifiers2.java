package com.bikalp.newjavalifeproject.Video11;



public class Video11AccessModifiers2 //class
{

protected int pro;

protected void sum(){

    System.out.println(pro);
}



    public static void main( String[] args ) //main method
    {
       
        Video11AccessModifiers2 pro2=new Video11AccessModifiers2();
        pro2.pro=50;
        pro2.sum();
       
    }
}
