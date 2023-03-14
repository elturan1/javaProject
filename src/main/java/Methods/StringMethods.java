package Methods;

public class StringMethods {


    static boolean compareStings(String str1, String str2){
        if (str1.equals(str2)) {
            return true;
        }// else {  i methods we don't have to add else, since if it' s not true it will go right away to return false
        return false;
    }

    static String concatinateStrings(String s1, String s2){
        return (s1 + s2).toUpperCase();

    }

    static int getLengthOfTwoStrings (String s1, String s2){
        return ((s1 + s2).length());
    }

    static boolean isEven (int num){
        if (num % 2 == 0){
            return true;
        }
        return false;

    }
    public static boolean isDivisible(int num){
        return num % 10 == 0;
    }

    public static void multiplicationTable (int a){
        for (int i = 1; i <=10; i++){

            System.out.println(a + " * " + i + " = " + (a * i));

        }
    }
    public static int  getLargest(int a, int b){
        if (a > b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }

     public static int returnsAverage(int a , int b, int c , int f){
        return (a + b + c + f) /4;
     }






    public static void main(String[] args) {
        boolean isSame = compareStings("hello", "hellloooo"); //false
        System.out.println(isSame);
        compareStings("bye", "sf");
        multiplicationTable(8);

    }





}

