package day_12continuenceofjav;

import java.util.Scanner;

public class c3_sumnumbers {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        Scanner input = new Scanner(System.in);
        int i1, i2;
        char choice;
        do {
            System.out.println("Enter FIrst number");
            i1 = input.nextInt();
            System.out.println("Enter Second Number");
            i2 = input.nextInt();
            int sum = i1 + i2;
            System.out.println("Sum of " + i1 + " + " + i2 + " is : " + sum);
            System.out.println("DO you want to sum 2 new numbers y/n");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
