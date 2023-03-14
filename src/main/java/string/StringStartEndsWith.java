package string;

public class StringStartEndsWith {
    public static void main(String[] args) {

        String banner = "ThanksGiving Sale 20%";

        boolean isSale = banner.startsWith("Thanks"); //true
        System.out.println(isSale);

        System.out.println(banner.startsWith("thanks")); // false
        System.out.println(banner.startsWith("T")); //true

        boolean endsWith = banner.endsWith("%"); // true
        System.out.println(endsWith);
        System.out.println(banner.endsWith("Sale 20"));// false




}
}
