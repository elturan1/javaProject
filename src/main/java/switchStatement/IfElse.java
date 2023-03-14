package switchStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        int name = month.nextInt();
        if (name == 12 || name == 1 || name == 2 ){
            System.out.println("winter");
        }
        else if (name == 3 || name == 4 || name == 5){
            System.out.println("spring");
        }
        else if (name == 6 || name == 7 || name == 8){
            System.out.println("summer");
        }
        else if (name == 9 || name == 10 || name == 11){
            System.out.println("fall");

        }
        else{
            System.out.println("INVALID NUMBER");
        }
    // =================================================================================
        switch (name){
            case 12, 1 ,2:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            case 9,10,11:
                System.out.println("fall");
                break;
            default:
                System.out.println("INVALID NUMBER");


        }

















    }
}
