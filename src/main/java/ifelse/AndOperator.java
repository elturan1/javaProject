package ifelse;

public class AndOperator {
    public static void main(String[] args) {


        if(2 > 3 && 5 < 10){
            System.out.println("hello");

        }

        if (false && true){
            System.out.println("potato");

        }
        if (true && false){
            System.out.println("do something");
        }
        if(true && true){
            System.out.println("cool");
        }

        //====================================


        String actualUsername = "sunshine123";
        String actualPassword = "moonlight456!true";
        String  actualEmail = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail =  "sunshine123@gmail.com";

        if (enteredUsername.equals(actualUsername) && enteredPassword.equals(actualPassword)) {

            System.out.println("logged in");
        }
        if(enteredEmail.equals(actualEmail)){
        System.out.println("recover email");

        }


        if (enteredUsername.equals(actualUsername)){

        }
        if(!enteredPassword.equals(actualPassword)){
            System.out.println("incorrect password, try again");
        }












    }
}
