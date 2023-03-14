package ProblemSolving;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();



       int length = word.length();
       boolean isPalindrom = true;

       for (int i = 0;  i < length/2; i++){
           if (word.charAt(i) != word.charAt(length-1-i)){
               isPalindrom = false ;
           }
       }
        System.out.println(isPalindrom);





    }
}
