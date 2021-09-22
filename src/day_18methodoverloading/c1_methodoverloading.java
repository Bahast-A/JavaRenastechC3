package day_18methodoverloading;

public class c1_methodoverloading {
    public static void main(String[] args) {
        method();
        method(10);
        method(10);
        method(20.0);
        method("Hello");

    }
    public static void method(){
        System.out.println("Method");
    }
    public static void method(int number){
        System.out.println(number+" backup method");
    }
    public static void method(double number){
        System.out.println(number+" double method");
    }
    public static void method(String text){
        System.out.println(text+" String Method");
    }

}
