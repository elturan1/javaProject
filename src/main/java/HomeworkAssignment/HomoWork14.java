package HomeworkAssignment;

import java.util.Scanner;

public class HomoWork14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int  number = scanner.nextInt();


        for (int i = 1; i < number; i++){
            if (number >= 3){
        if (number % 3 == 0 && number % 5 != 0);{
                    System.out.println(i);
                }
            } else if ( number < 0 ){
                System.out.println("Input must be positive");

            } else {
                System.out.println("There are no integers less than " + number + "there are divisible");
            }

        }
        String  name = "Eltura" ;
        String  reverse = "";
        for (int i = name.length() - 1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);










    }
}
