package day7_javacontinuance;

import java.util.Scanner;

public class c2_scannerpractice {
    public static void main(String[] args) {
        Scanner tool1 = new Scanner(System.in);
        System.out.println("Insert First Number : ");
        int number1 = tool1.nextInt();
        System.out.println("You have inserted numbe : " + number1);
        if (number1 % 2 == 0) {
            System.out.println(number1 + " is even number");
        } else {
            System.out.println(number1 + " is odd number");
        }
        Scanner tool2 = new Scanner(System.in);
        System.out.println("Enter First Number");
        int int1 = tool2.nextInt();


    }
}
