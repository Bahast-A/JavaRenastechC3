package day5_whatever;

public class c3_multiifstatements {
    public static void main(String[] args) {
        int x = 25;
        int y = 35;
        if (x == y) {
            System.out.println(x + " equal to " + y);
        } else if (x > y) {
            System.out.println(x + " is bigger then " + y);
        } else {
            System.out.println(x + " is smaller than " + y);
        }
        int p = 33;
        if (p == 0) {
            System.out.println("You are at starting point");

        } else if (p == 10) {
            System.out.println("You are at ending point");
        } else if (p > 0 && p < 10) {
            System.out.println("You are on your way");
        } else {
            System.out.println("Wrong way");
            System.out.println("Please check your way " + p);
            System.out.println("Point has to be between 0-10");
        }


    }
}
