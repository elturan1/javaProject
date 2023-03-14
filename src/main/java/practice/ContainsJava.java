package practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();

        if (word.toLowerCase().contains("Java")){
            System.out.println("Yes, contains Java");
        } else {
            System.out.println("No, doesn't contains Java");
        }
















    }
}
