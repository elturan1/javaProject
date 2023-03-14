package primitiveDataTypes;

public class practiceDobleFloat {
    public static void main (String [] args){

        /*
        float and double are variables that store decimal numbers
        double is longer than float
        double is the most precise variable
         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.999999494949494999999;
        System.out.println(priceOfApples);

        priceOfBread = 5676557575557.787878;
        System.out.println(priceOfBread);

        priceOfBread = 98.1;

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545;
        double double1 = 2343;

        float1 = (float)double1;

        double1 = float1;

        double1 = long1;

        double1 = 4.99;
        long1 = (long) double1;
        System.out.println(long1);

        //====================================================================

        /*
        4.88 - floating, fractional
        1,2,3 - whole number
        1234567890 - decimal system


         */
        float1 = 454544543;

        byte1 = (byte)float1;
        System.out.println(byte1);



        int a  = 5;
        double d = 123.00000001;
        a = (int)d;
        System.out.println(a); //123

        short sh;
        float f = (float)12.7;
        f = 12.7F;
        sh = (short)f;
        System.out.println(sh);

        double price = 2.5;

        double1 = long1;
        int1 = (int)float1;








    }
}
