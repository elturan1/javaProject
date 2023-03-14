package primitiveDataTypes;

public class PracticeVariableDeclaration {
    public static void main (String[] args){
        byte myByte; // declaring variable
        byte _another_byte =9;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);

        myByte = 20;
        System.out.println(_another_byte);

        short myShort = 5;
        myShort = 3;
        System.out.println(myShort);

        short myShort2 = 10;
        myShort2 = 25;
        System.out.println(myShort2);





        int myInt1 = 123243543;
        myInt1 = 84885;
        System.out.println(myInt1);
        int myInt2 = 1212334;
        myInt2 = 32;
        System.out.println(myInt2);








        long longNumber1 = 1;
        longNumber1 = -2000;

        long longNumber2 = -23234554343435L;
        longNumber2 = 23234554343435L;

        longNumber2 = myInt2; //32
        System.out.println(longNumber2);


        byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 0;
        long LongNumber = 35000;







        //Casting


        byteNumber =(byte)intNumber;

        shortNumber = (short)byteNumber;
        System.out.println(shortNumber);

        intNumber = 40;
        intNumber = shortNumber;
        System.out.println(intNumber);
















        /*


        1. Declare variable (means create container)
        2. Assign value to variable (put value inside variables)
        3. Reassign  value to variable (put new value to the same variable)

        VARIABLE DECLARATION

        byte myByte;
        short myShort;
        int myInt;
        long myLong;


        VALUE ASSIGNMENT

        byte myByte = 3; (declare variable and assign value)

        short age; (declaring variable)
        age = 40;  (assigning value to variable)


        REASSIGN VALUE
        int number = 100;
        number = 30:






       NAMING CONVENTION:
       all variables must start with lower case
       all variables must use camelCase (thisIsMyCamelCaseLongWord)
       all classes must start with upper case, use camelCase
       all packages must start with




         */
          // single line comment

    }
}
