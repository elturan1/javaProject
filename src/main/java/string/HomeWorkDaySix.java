package string;

public class HomeWorkDaySix {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        /*

         */
        System.out.println("The character at position is: " + message.charAt(10));
        /*
        . print out the length of the String message
         */



        System.out.println("the length of message is: " + message.length());

        System.out.println(message.toUpperCase());

        System.out.println(message.toLowerCase());

        System.out.println("letter #5 is: " + message.charAt(4));

        System.out.println("the last of the message is: " + message.charAt(message.length()-1));

        System.out.println(message.substring(0,1).toLowerCase() + message.substring(1));
        System.out.println(message.substring(0, message.length()-1) + message.substring(message.length()-1, message.length()).toUpperCase());







    }
}
