package ifelse;

public class introToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b");

        if(a == b){
            System.out.println(" a is more than b");

        }else {
            System.out.println("earth is larger than sun");
        }

        System.out.println(" I already compare a and b");


        int number1 = 100;
        int number2 = 50;

        if(number1 / number2 == 2){
            System.out.println("YES, two");
        }else {
            System.out.println("Not two");
        }




        String elon = "Tesla SpaceX Paypal Twitter";

        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println(("Elon did not own Paypal"));

        }


        /*
        create 5 if else statements,
        2 boolean statement with numbers

         */
        int bot1 = 95;
        int bot2 = 5-100;

        if (bot1/bot2 == 0){
            System.out.println("Not equal");
        }else{
            System.out.println("Yes, equal");
        }
















    }
}
