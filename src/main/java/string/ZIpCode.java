package string;

import java.util.Scanner;

public class ZIpCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit zipcode");
        int zipcode = sc.nextInt();
        String zip = zipcode + "";
        if (zip.length() == 5 && !zip.contains("9") && !zip.startsWith("0")) {
            System.out.println("Zip code is valid");

        } else {
            System.out.println("Entered zip code is not valid");
        }




















    }
}
