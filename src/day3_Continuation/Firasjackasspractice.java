package day3_Continuation;

import java.sql.SQLOutput;

public class Firasjackasspractice {
    public static void main(String[] args) {
        System.out.println();
        int x= 10; int y=x+7; int z=y+8;
        boolean bol1= x%2 == 0;
        boolean bol2= x%3 == 0;
        boolean bol3= x%5 == 0;

        System.out.println(x+ " is divisible by 2 "+bol1);
        System.out.println(x+ " is divisible by 3 "+bol2);
        System.out.println(x+ " is divisible by 5 "+bol3);


    }




}
//create 3 different number
// second number should be = first number + 7
// third number should be  = second number + 8
//ex : x=25  , y= 32 , z= 40 .
//ex : x 20 , y= 27 , z= 35 .

//if the x is divisble by 2 ,3 ,5
//        3. check if x is divisible by 2 , 3 , 5  (Check for each number)
//                      if it is divisible print : x  is divisible by 2 true
//                      if it is not divisible print : x is divisible by 2 false