package day5_whatever;

public class c4_quiz {
    public static void main(String[] args) {
        int number ;
        number=25;
        String result="";
        if(number % 2 == 0){
            result = number+ " is even";

        }else{
            result = number +" is odd";
        }
        System.out.println(result);
        String result2=(number % 2 == 0) ? "Number is even" : "Number is odd" ;
        System.out.println(result2);
    }
}
