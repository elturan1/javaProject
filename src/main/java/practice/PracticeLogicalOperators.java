package practice;

import java.util.Scanner;

public class PracticeLogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter boolean: true/false");
        boolean a = scanner.nextBoolean();

        System.out.println("Enter second boolean: true/false ");
        boolean b = scanner.nextBoolean();


        if (a == true && b == false) {
            System.out.println("A is true and B is false");
        } if (a == false && b == true ){
            System.out.println("A is false and B is true");
        } if (a == true && b == true) {
            System.out.println("Either A and B is true");
        }  if (a == false && b == false){
            System.out.println("Both A and B are false");
        }











    }
}
