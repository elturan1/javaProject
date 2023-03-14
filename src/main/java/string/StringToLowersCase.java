package string;

public class StringToLowersCase {
    public static void main(String[] args) {

        String word = "Hello everYONE HOW ARE you doinG";
        System.out.println(word);

        word = word.toLowerCase(); // cower to lower case
        System.out.println(word);


        String word2 = "hello guys, I'm good. AND you";
        System.out.println(word2);

        word2 = word2.toUpperCase();
        System.out.println(word2);



        String word3 = "Hello everyone";
        String word4 = "HELLO EVERYONE";

        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equals(word4.toLowerCase()));




    }
}
