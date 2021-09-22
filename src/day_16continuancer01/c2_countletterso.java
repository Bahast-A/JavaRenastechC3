package day_16continuancer01;

import java.util.Arrays;

public class c2_countletterso {
    public static void main(String[] args) {
        String sentence="Java is best, Java is fun, Python is also fun, Hello world";
        String[] letters=sentence.split("");
        System.out.println(Arrays.toString(letters));
        int countlettersA=0;
        for(String eachLetter:letters){
            if(eachLetter.equalsIgnoreCase("a")) {
                countlettersA++;
            }
        }

        System.out.println("Count of A is "+countlettersA);
    }
}
