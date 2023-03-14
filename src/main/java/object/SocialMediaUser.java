package object;

public class SocialMediaUser {

    String username;
    String password;
    String email;
    String  firstName;
    String  lastName;
    int age;

    public void setUsername(String username){
        boolean isValidName = true;
        if(username.equals(null) || username.isEmpty() || username.length() <= 16 || username.trim().length()==0){
          isValidName= false;
        }
        if(isValidName){
            System.out.println("Success. Your username is valid ");
        }
        else{
            System.out.println("Error. The user name can not be empty or more than 16 letters");
        }
    }

    public void login(String username){

    }

    public void resetPassword (String password){

    }
    public void getFullName (String firstName, String lastName){

    }



}
