package object;

public class FaceBookUser {
    String  username;

    String password;

    String firsName;

    String lastName;

    public void login (String username, String password){
        System.out.println(username + " logged in to the application");
    }
    public static void  main (String[] args){
        FaceBookUser user = new FaceBookUser();
        user.login( "abc", "abc123");
        user.username = "tokyo";
        user.password = "abc123";

        FaceBookUser user2 = new FaceBookUser();
        user2.username = "bena";
        user2.password = "2023";
        user2.login(user2.username, user2.password);
    }



    }

