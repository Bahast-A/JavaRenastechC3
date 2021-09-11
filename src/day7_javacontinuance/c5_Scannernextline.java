package day7_javacontinuance;

import java.util.Scanner;

public class c5_Scannernextline {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Full Name");
        //String fullname=scan.next(); //.next will only take 1 word- 2 words use nextline
        String fullname=scan.nextLine();
        System.out.println(fullname);
    }
}
