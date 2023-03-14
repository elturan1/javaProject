package string;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length()); // return numbers of chars

        System.out.println(singerName.endsWith("ON")); // false
        System.out.println(singerName.startsWith("Misha"));//false

        System.out.println(singerName.isEmpty()); // false
        System.out.println(singerName.toLowerCase());
        System.out.println(singerName); // ne izmenilos

        singerName = singerName.toUpperCase();
        System.out.println(singerName);
        System.out.println(singerName);

        System.out.println("" + singerName.charAt(0) + singerName.charAt(3)); //Mh

        System.out.println(singerName.charAt(8));
        System.out.println(singerName.indexOf("C"));
        System.out.println(singerName.indexOf( "C" , 6));
        System.out.println(singerName.indexOf("W")); // -1

        //System.out.println(singerName.charAt(2344)); // Index out of the bounds

        String singerName2 = "Justin Biber";
        boolean areTheySame = singerName2.equals(singerName); //false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2)); // true

        singerName = singerName2;

        System.out.println(singerName.equals(singerName2)); //true







    }
}
