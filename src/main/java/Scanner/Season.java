package Scanner;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner tellmonth = new Scanner(System.in);

        System.out.println("Enter  month: ");
        String month = tellmonth.next();

        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
                || month.equalsIgnoreCase("December")) {

            System.out.println("Winter time !!!");


        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||
                month.equalsIgnoreCase("May")) {
            System.out.println("Spring time");

        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
                || month.equalsIgnoreCase("August")) {
            System.out.println("SUMMER TIME");

        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("November")) {

        System.out.println("Autum time");
    }

















    }
}
