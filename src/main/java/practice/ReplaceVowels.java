package practice;

import string.StringStartEndsWith;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        sentence = sentence.replaceAll( "[eyauioAUYOE]", "X");
        System.out.println(sentence);














    }
}
