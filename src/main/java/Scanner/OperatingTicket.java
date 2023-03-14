package Scanner;

import java.util.Scanner;

public class OperatingTicket {
    public static void main(String[] args) {

        Scanner driver = new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed = driver.nextInt();

        System.out.println("Birthday? Enter: true/false");
        boolean isBirthday = driver.nextBoolean();


    }

}
