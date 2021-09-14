package day10_morejavastufffo;

public class c6_breakstatement200 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Java");
            if (i == 4) {
                System.out.println("Java2");

            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            if (i == 3) {
                System.out.println("Stop Hello");
                break;
            }
            System.out.println("Hello Again");
        }
    }
}
