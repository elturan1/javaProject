package HomeworkAssignment;

public class HomeWorkDay4cast {
    public static void main(String[] args) {

        /*

        Create VariableCastingHomework java class, create main method inside it and:

    1. create and assign different values to 1 byte, 1 short, 1 int, 1 long, 1 float, 1 double variables

    2. one by one, assign short, int, long, float, double variable values to byte. Cast values if needed.

    3. one by one, assign byte, int, long, float, double variable values to short. Cast values if needed.

    4. one by one, assign short, byte, long, float, double variable values to int. Cast values if needed.

    5. one by one, assign short, int, byte, float, double variable values to long. Cast values if needed.

    6. one by one, assign short, int, long, byte, double variable values to float. Cast values if needed.

    7. one by one, assign short, int, long, float, byte variable values to double. Cast values if needed.


         */
        byte byteNum = 10;
        short shortNum = 343;
        int intNum = 10;
        long longNum = 123456l;
        float floatNum = 12.4f;
        double doubleNum = 4.12;

        shortNum = byteNum;
        intNum = byteNum;
        longNum = byteNum;
        floatNum = byteNum;
        doubleNum = byteNum;

        byteNum = (byte) shortNum;
        intNum = shortNum;
        longNum = shortNum;
        floatNum = shortNum;
        doubleNum = shortNum;


        shortNum = (short)intNum;
        byteNum = (byte)intNum;
        floatNum = intNum;
        longNum = intNum;
        doubleNum = intNum;


        intNum = (int)longNum;
        byteNum = (byte)longNum;
        shortNum = (short)longNum;
        floatNum = longNum;
        doubleNum = longNum;




        byteNum = (byte)floatNum;
        shortNum = (short)floatNum;
        intNum = (int)floatNum;
        longNum = (long)floatNum;
        doubleNum = floatNum;


        byteNum = (byte) doubleNum;
        shortNum = (short) doubleNum;
        intNum = (int) doubleNum;
        longNum = (long) doubleNum;
        floatNum = (float) doubleNum;

























    }
}
