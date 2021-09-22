package day_15forloopeach;

import java.util.Arrays;

public class c1_foreachloop {
    public static void main(String[] args) {
        String Sentence="Java is fun ";
        String[] splitsentence=Sentence.split(" ");
        System.out.println(Arrays.toString(splitsentence));
        String reverseSentence="";
        for(int i=splitsentence.length-1;i>=0;i--) {
            reverseSentence += splitsentence[i]+" ";
            System.out.println("in the loop " + reverseSentence);
        }
        System.out.println("**************************");
        System.out.println(reverseSentence);
        String sentence2="Java is fun";
        String[]splitSentence2=sentence2.split(" ");
        String reverseString2="";
        for(int i=splitSentence2.length-1;i>=0;i--){
            reverseString2+=splitSentence2[1];

        }
        System.out.println(reverseString2);
    }

}
