package MethodOverloading;

public class IsPrime {

    public boolean  IsPrime1 (int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public  boolean IsPrime1 (short number){
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean IsPrime1 (long number){
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
