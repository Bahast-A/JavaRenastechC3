package day_18methodoverloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c4_methodoverloading {
    public static void main(String[] args) {

        concatination("hello","world","Java");
        System.out.println(concatination("hello","world","Java"));

        int[] numbers={1,2,3,4,};
        String[] names={"ridvan","Bahast","Musab"};
        char[] letters={'a','b','x','d','e'};
        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));
    }

    public static String concatination(String str1,String str2){
        return str1.concat(" "+str2);

    }
    public static String concatination(String str1,String str2,String str3){
        return str1.concat(" "+str2).concat(" "+str3);
    }
}
