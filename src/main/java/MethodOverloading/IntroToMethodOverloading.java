package MethodOverloading;

public class IntroToMethodOverloading {

    /*
    Method name must be unique . We can not have two or more methods to use the same name
     */

    public int getAreaOfRectangle(int length, int width){
        return length * width;

    }

    public int getAreOfRectangle( double length , double width){
        System.out.println(9.5);
        return (int)(length * width);
    }



    public int getPerimeterOfSquare(int length , int width){
        return  (length * width);
    }

    public  int getPerimeterOfSquare(long length ,long width){
        return(int) (length * width);
    }

    public int getPerimeterOfSquare(double length, double width){
        return(int) (length * width);
    }



}
