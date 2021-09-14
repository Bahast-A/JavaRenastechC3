package day7_javacontinuance;

import java.util.Scanner;

public class C1_scannerClass {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Insert your byte number");
        byte b1 = input.nextByte();
        System.out.println(b1);
        int numberint = input.nextInt();
        System.out.println("Number int is " + numberint);
    }
}
