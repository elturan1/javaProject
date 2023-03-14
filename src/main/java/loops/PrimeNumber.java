package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean isEltu = true;
        for (int i = 4; i < number; i++){

            if (number % i == 0){
                isEltu = false;
                break;
            }
        }
        if (isEltu){
            System.out.println("prime num");
        }
        else{
            System.out.println(" not prime num");
        }










    }
}
