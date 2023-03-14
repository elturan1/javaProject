package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        for (int t = 0; t <= sum; t++){
            System.out.println(t);
            if (t >= 45){
                break;

            }
        }
        System.out.println();







        //===========================================================================
















    }
}
