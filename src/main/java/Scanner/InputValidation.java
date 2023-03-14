package Scanner;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner iv = new Scanner(System.in);

        System.out.println("Integer between 1 an 10:");
        int num1 = iv.nextInt();

        if (num1 >= 1 && num1 <= 10){
            System.out.println("Valid input");
        }
        else {
            System.out.println("Invalid input");
        }



    }
}
