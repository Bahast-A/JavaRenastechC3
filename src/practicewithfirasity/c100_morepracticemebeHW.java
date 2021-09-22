package practicewithfirasity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c100_morepracticemebeHW {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("Question One");
        add();
        subtract();
        multiply();
        System.out.println("****************************************");
        System.out.println("Question Two");
        String s1="I like java, java is the best, javascript is amazing, java and javascript are still java";
        String []sentence=s1.split(" |, ");
        System.out.println(Arrays.toString(sentence));
        int cj=0;
        int cjs=0;
        for(String a:sentence) {
            if (a.equalsIgnoreCase("java")) {
                cj++;
            }
        }
        for(String a:sentence){
            if (a.equalsIgnoreCase("javascript")) {
                cjs++;
            }

            }





        System.out.println("Count of java is "+cj);
        System.out.println("Count of javascript is "+cjs);
        System.out.println("******************************************");
        System.out.println("Question Three");
        String [] arr={"A","A","B","C","C"};
        System.out.println(arr[4]);
        System.out.println("******************************");
        System.out.println("Question Four");
        String s10="mom";
        String reverse="";
        for(int ip=s10.length()-1;ip>=0;ip--){
            reverse+=s10.charAt(ip);
            System.out.println(reverse);
        }
        boolean palindrome = true;
        for(int ip=0;ip<s10.length();ip++){
            if(s10.charAt(ip) != reverse.charAt(ip)){
                palindrome = false;
            }if(palindrome){
                System.out.println(s10+ " palindrome is true");
            }else{
                System.out.println(s10+ " Palindrome is false");
            }
        }



        }


        public static void add(){
        int i=20;
        int i1=25;
            System.out.println(i+i1);


        }
        public static void subtract(){
        int i2=100;
        int i3=15;
            System.out.println(i2-i3);


        }
        public static void multiply(){
            int i4=30;
            int i5=40;
                System.out.println(i4*i5);
        }

    }
