package day9_moremorejava;

import java.util.Scanner;

public class c2_twitterlogin {
    public static void main(String[] args) {
        String expectedusername = "renastech";
        String expectedpassword = "renastech123";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username :");
        String userinput = input.nextLine();
        System.out.println("Enter Password : ");
        String userpass = input.nextLine();
        if (userinput.equals(expectedusername) && userpass.equals(expectedpassword)) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("Login function has failed");
            System.out.println("invalid credentials please check your credentials");
            System.out.println("Credentials are :" + userinput + "," + userpass);
        }
    }
}
