package ProblemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("something");
        String str1 = sc.next();
        String reversed = " ";

        for (int i = str1.length()-1; i >= 0; i-- ){
          reversed += str1.charAt(i);
        }
        System.out.println(reversed);

















    }
}
