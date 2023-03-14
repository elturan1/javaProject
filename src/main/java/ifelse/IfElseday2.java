package ifelse;

import java.security.spec.RSAOtherPrimeInfo;

public class IfElseday2 {
    public static void main(String[] args) {


        /*
        if boolean ) {
      write some code
        }
        else if (boolean) {
        write else if code
        }
        else{
        write else code
        }

         */

        int day = 3;
        /*
        if day = 1 print Monday
        day = 2 print Tuesday
         */

        if (day == 1) {
            System.out.println("Monday!");
        }
        else if (day ==2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");

        }
        else if (day == 4){
            System.out.println("Thursday");
        }












        String dayOfWeek = "Tuesday";

        if (dayOfWeek.equalsIgnoreCase("Monday")){
            System.out.println(1);
        }
        else if (dayOfWeek.equalsIgnoreCase("Tuesday")){
            System.out.println(2);
        }
        else if(dayOfWeek.equalsIgnoreCase("Wednesday")){
            System.out.println(3);

        }
        else if (dayOfWeek.equalsIgnoreCase("Thursday")){
            System.out.println(4);
        }
        else if (dayOfWeek.equalsIgnoreCase("Friday")){
            System.out.println(5);
        }
        else if (dayOfWeek.equalsIgnoreCase("Saturday")){
            System.out.println(6);
        }
        else if (dayOfWeek.equalsIgnoreCase("Sunday")){
            System.out.println(7);
        }
        else {
            System.out.println(-1);
        }



        byte time = 18;

        if (time >= 9 && time <=17) {
            System.out.println("WORK HOURS");
        }
        else if(time >= 7 && time <=9 || time >= 18 && time <=19){
            System.out.println("COMMUTE HOURS");
        }
        else if (time >= 6 && time <= 8) {
            System.out.println("BREAKFAST TIME");
        }
        else if (time >= 13 && time <= 13){
            System.out.println("LUNCH TIME");
        }
        else if (time >= 20 && time <= 22){
            System.out.println("DINNER TIME");
        }














    }
}
