package day3_Continuation;

public class c7_postpreconditions {
    public static void main(String[] args) {

        int x = 10; // post and pre conditions will affect the values i set

        System.out.println(x);

        System.out.println(++x); //pre condition will increase your number by one immedietely
        int y = 20;
        System.out.println(y);
        System.out.println(y++); // post condition will increase your number by one next step
        System.out.println(y);


    }


}
