
//  ITSE305 Phase2 - Batool Ahmed Abdulla Alasmawi  202107846   sec 01
import java.util.*;
import java.util.Scanner;

// SignIn class
public class SignIn {
    // our data/attributes values stored in ArrayLists
    private ArrayList<String> usernames = new ArrayList<>(Arrays.asList("ali", "yousif", "fatima"));
    private ArrayList<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

    // method to verification ( check user inputs)
    public boolean authenticate(String username, String password) {
        for (int i = 0; i < usernames.size(); i++) {
            if (username.equals(usernames.get(i)) && password.equals(passwords.get(i))) {
                return true;
            }
        }
        return false;
    }

    // Method to add a new user (remains protected)
    protected void addUser(String username, String password) {
        usernames.add(username);
        passwords.add(password);
        System.out.println("User added successfully!");
    }

    // Method for user sign-in
    // method to ask the user to enter her/his username and password to Sign in to
    // the system, system will pop up a successful/failed message, depend on user
    // inputs
    public void userSignIn() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to ITSE305sem2 system project !!");

        System.out.print("Enter your username: ");
        String username = userInput.nextLine();

        System.out.print("Enter your password: ");
        String password = userInput.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Sign in successful!");
        } else {
            System.out.println("Sign in failed. Invalid username or password.");
        }

        userInput.close();
    }

    // Main class, to excute/run the code we call the method
    // here we call signIn.userSignIn() that will propote the user to enter her/his
    // username and password,
    // then check for verification. finally, a message will appears
    // (successful/failed )
    public static void main(String[] args) {
        SignIn signIn = new SignIn();
        signIn.userSignIn(); // User sign-in
    }
}