package com.bikalp.newjavalifeproject.Video11;

/* 

class privateClass {

private int x=10;

private  void sumPrivate(){

    System.out.println(x);
}


}
*/

class defaultClass{

    int y=10;

    void sumDefault(){

        System.out.println(y);
    }
}





public class Video11AccessModifiers //class
{
    public static void main( String[] args ) //main method
    {
       /* 
        privateClass aclass= new privateClass();
        //aclass.x=500;
        //aclass.sumPrivate();
        */
        defaultClass dclass=new defaultClass();
        dclass.sumDefault();
        
    }
}
