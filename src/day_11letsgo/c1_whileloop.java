package day_11letsgo;

public class c1_whileloop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Before break");
            if (i == 2) {
                break;//java reaches here it will break the loop -

            }
            System.out.println("After if");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Before continue");
            if (i == 2) {
                continue;
            }
            System.out.println("after continue" + i);
        }

    }
}
