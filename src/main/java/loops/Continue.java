package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }


        //========================================================================================


        for (int t = 1; t <= 100; t++) {
            if (t % 2 == 0) {
                continue;
            }
            System.out.println(t);
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive and negative number");
        int negative = sc.nextInt();
        int positive = sc.nextInt();

        for (int x = negative; x <= positive; x++){
            if (x < 0 && x % 2 == 0) {
                continue;
            } else if (x > 0 && x % 2 != 0) {
                continue;
            }
        System.out.println(x);
    }















    }
}
