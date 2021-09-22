package day_18methodoverloading;



import java.lang.reflect.Array;

public class c3_methodoverloading {
    public static void main(String[] args) {
    int[] numbers={1,2,3,4,};
        System.out.println("String Main");
        main(numbers);
    }
    public static void main(double [] args){
        System.out.println("Double main");

    }
    public static void main(int[] args){
        System.out.println("Int main");

    }
}
