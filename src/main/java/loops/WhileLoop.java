package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <=10) {
            System.out.println(i);
            i++;
        }
        //===================================================



        int  k = 1;
        while (k <= 10){
            k++;
            System.out.println("Good morning everyone!");
        }
            //============================================

            for ( int x = 1; x <= 10; x++){
                System.out.println("Good morning!");

            }



            // =============================================

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean  isPrime = true;

        int i2= 2;

        while(i2 < number){
            if (number % i2 == 0){
                isPrime = false;
                break;

            }
            i2++;
        }
        if (isPrime){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Not prime");
        }
























    }
}
