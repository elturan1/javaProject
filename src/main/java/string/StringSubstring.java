package string;

public class StringSubstring {
    public static void main(String[] args) {

        String  message = "Hello Chicago, why are you cold and windy?";

        String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign =  "Welcome to USA, our population is 140 million people, " +
                "the average salary is 90k dollars, and our president is Joe Biden";
        /*
        country  = USA
        population = 140 million
        salary = 90k
        president = Joe Biden

         */
       // String country = welcomeSign.substring(11, 14)
        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf(","));
        System.out.println(country);

        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people"));
        System.out.println(population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("9"), welcomeSign.indexOf(" and") -1);
        System.out.println(salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);

        String phrase = "Just one positive thought in the morning can change your whole day.";

        System.out.println(phrase.substring(0, 4) + " a " + phrase.substring(18, 25));

        int beginIndex = phrase.indexOf("positive");
        int endIndex = phrase.indexOf("thought");
        System.out.println(phrase.substring(beginIndex, endIndex));


        System.out.println(phrase.substring(9, 17) + " " + phrase.substring(33, 40));


        //=================================================new assignment

        String  str1 = "hi";
        String  str2 = "bye";

        /*
        hibyebyehi
         */

        System.out.println(str1 + str2  + str2 + str1);

        System.out.println(str1 + " " + str2 + " HI" + " HI"+ " BYE");



        String see = "see";
        String hear = "hear";
        System.out.println(see.substring(0,1) + hear.substring(1,4));
        System.out.println(hear.replace('h','s'));








    }
}
