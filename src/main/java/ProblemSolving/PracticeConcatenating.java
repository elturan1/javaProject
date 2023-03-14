package ProblemSolving;

import java.util.Scanner;

public class PracticeConcatenating {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();

       word1 = word1.toLowerCase();
       word2 = word2.toLowerCase();

        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring( 1));

        System.out.println(word1.toUpperCase().charAt(0) + word1.substring( 1) +
                word2.toUpperCase().charAt(0) + word2.substring( 1));

        System.out.println(word1.toUpperCase() + " " + word2 + " " + word2 + " " + word1.toUpperCase());










    }
}
