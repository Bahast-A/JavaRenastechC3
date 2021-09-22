package day_14arraysecond2;

import java.util.Scanner;

public class c1_arraypractice222 {
    public static void main(String[] args) {
        String [] s1={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number");
        int i1= scan.nextInt();
        int attempt=1;
        String result=s1[i1-1];
        System.out.println(result);
        while(i1>7 || i1<1){
            System.out.println("Invalid number");
            System.out.println("Try again");
            if(attempt==3&&(i1>7 || i1<1)){
                System.out.println("User tried 3 times");
                System.out.println("System Locked for 1 hour");
            }
        }

    }

}
