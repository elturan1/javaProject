package string;

public class StringTrim {
    public static void main(String[] args) {
        /*
        thin() method removes empty spaces from both ends of the string
         */

        String  batch = "  Batch 2 is cool   ";
        System.out.println(batch);

        batch = batch.trim();
        System.out.println(batch);

        System.out.println(batch.contains("cool"));// true
        System.out.println(batch.contains("lazy"));// false
        System.out.println(batch.contains("2")); // true
        System.out.println(batch.contains(" ")); //true

        batch =
                batch.concat("Bena");



    }

}
