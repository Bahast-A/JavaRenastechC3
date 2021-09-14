package day_11letsgo;

import java.util.Scanner;

public class c5_sumofnumerical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int start = 0;
        int sum = 0;
        while (start <= number) {
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}
