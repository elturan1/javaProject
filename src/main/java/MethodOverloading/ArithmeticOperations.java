package MethodOverloading;

public class ArithmeticOperations {

    public int sumOfNumbers (int a2, int b3){
        return a2 + b3;

    }
    public int sumOfNumbers(int a, int b, int c){
        return  a + b + c;

    }

    public double  getAreaOfTriangle (int base, int height){
        int area = 1/2 * base * height;
        return area;
    }

    public double getAreaOfTriangle ( int a , int b , int c){
        int  semiPerimeter = ( a + b + c)/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        return area;




        }
    }



