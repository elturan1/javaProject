package practice;

import java.util.Scanner;

public class AscendingInteger {
    public static void main(String[] args) {

        Scanner green = new Scanner(System.in);
        System.out.println("enter first number");
        int a = green.nextInt();

        System.out.println("Enter second number");
        int b = green.nextInt();

        System.out.println("Enter third number");
        int c = green.nextInt();

        if (a > b && a > c) {

            if (b > c){
                System.out.println("Ascending: " + c + ", " + b + ", " + a );
                System.out.println("Ascending: " + a + ", " + b + ", " + c );
            }
            else{

            }

        }















    }
}
