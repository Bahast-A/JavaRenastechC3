package day_18methodoverloading;

public class c2_MethodOverloading {
    public static void main(String[] args) {
        sum(5,10);

    }
    public static void sumof2numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
}
