package day10_morejavastufffo;

import java.util.Scanner;

public class c4_testerings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Word : ");
        String word = input.nextLine();
        int length = word.length();
        System.out.println("length of plain word " + length);
        if (word.substring(0, 1).equalsIgnoreCase("a")) {
            word = word.substring(1);

        }
        length = word.length();
        System.out.println("length of word after first if check " + length);
        int lastIndex = length - 1;
        if (word.substring(lastIndex).equalsIgnoreCase("A")) {
            word = word.substring(0, lastIndex);
        }
        System.out.println("Modified word " + word);
    }
}
