package Lab3;

class Login {
    Login() {
        System.out.println("You are not logged in!");
    }
    Login(String username, String pass) {
        System.out.println("You are logged in!");
    }
}

public class LoginMsg {
    public static void main(String args[]) {
        new Login();
        new Login("hello", "world");
    }
}
