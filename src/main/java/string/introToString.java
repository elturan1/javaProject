package string;

public class introToString {
    public static void main(String [] args){

        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName); //John
        System.out.println(lastName); // Doe


        firstName = "Mike";
        lastName = "Bobe";

        System.out.println(lastName); // Bobe

        String myName = "Elturan";
        String myMiddleName = "Saparbekovich";
        String myLastName = "Tumonbaev";

        byte age = 21;

        String myAddress = "2122 West Arthur Ave";
        String myMobile = "+17732995807";
        String friendsName = "Steve";
        String city = "Chicago";

        System.out.println(myName);
        System.out.println(myMiddleName);
        System.out.println(myLastName);
        System.out.println(age);
        System.out.println(myAddress);
        System.out.println(myMobile);
        System.out.println(friendsName);
        System.out.println(city);

        System.out.println("I am"+" "+ age+" "+"years old");
        System.out.println("He called"+" "+"me"+" " + myLastName);

        String address = "1234 Lincoln street";
        System.out.println("My address is: " +myAddress);


        /*
        String concatenation

         */

        String fruit1 = "apple";
        System.out.println(fruit1);
        System.out.println(fruit1 + fruit1);

        //====================================================================================================





        String city1 = "London";
        System.out.println(city1);

        String city2 = new String ("New York");
        System.out.println(city2);




        //===================================================

        System.out.println(city1.length()); //6
        System.out.println(city2.length()); // 8



        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is:" + name. length());

        System.out.println("Madrid");

        String school = "Codewise";
        school = "Codewise Academy";


        /*
        Equels () method compares values of 2 String
         */

        String fruit3 = "apple";
        String fruit4 = "apple";
        String fruit5 = "Apples";

        boolean isSame = fruit3.equals(fruit4);
        System.out.println(isSame);

        isSame = fruit3.equals(fruit5);
        System.out.println(isSame); // false


        fruit3 = "banana";
        fruit4 = "orange";

        System.out.println("Is banana same as orange?" + fruit3.equals(fruit4));  // false

        boolean isSame2 = !fruit3.equals(fruit4);  // not equals, TRUE

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        //equalsIgnoreCase(),  equals() , ! equals()

        boolean Ss = (!state1.equals(state2)); // True
        System.out.println(Ss);

        boolean check = (state2.equalsIgnoreCase(state4));
        System.out.println(check);

        boolean fal = (state3.equals(state5));
        System.out.println(fal);

        boolean f4 = (state5.equals(state1));
        System.out.println(f4);

        boolean c5 =(!state4.equals(state3));
        System.out.println(c5);







        int cucumber = 5;
        int tomato = 10;

        int empty = cucumber; // 5
        cucumber = tomato; //10
        tomato = empty; //5



        System.out.println("cucumber:" + cucumber); // cucumber: 10
        System.out.println("tomato:" + tomato); // tomato: 5


        //==========================================

        int aa = 5;
        int bb = 10;

        int cc = aa;
        aa += cc; //10
        bb -= cc; // 5

        System.out.println("aa" + aa);
        System.out.println("bb" + bb);





    }

}
