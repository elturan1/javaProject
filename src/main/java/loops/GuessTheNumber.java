package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

       int randomNumber = new Random().nextInt(1, 100);
       Scanner scan = new Scanner(System.in);
       int num;

       do{
           System.out.println("Enter the number");
           num = scan.nextInt();
           if ( num < randomNumber ){
               System.out.println("too low");

           }else if (num >randomNumber ){
               System.out.println(" too high");
           }
           else {
               System.out.println(" you guess the right number");
               break;
           }
       } while (num <= 100);















    }
}
