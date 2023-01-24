package Class12;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter username:  ");
        String username=input.next();
        System.out.println("Enter password:  ");
        String password=input.next();
        System.out.println("Enter password again:  ");
        String output=input.next();
        if (username.isEmpty()|| password.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        }else if (password.length() <8) {
            output = "Password is too short";
        }else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(output)) {
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");


    }
    }
}
