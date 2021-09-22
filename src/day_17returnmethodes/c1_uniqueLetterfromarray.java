package day_17returnmethodes;

import java.util.Arrays;

public class c1_uniqueLetterfromarray {
    public static void main(String[] args) {
        String [] s1={"A","A","B","C","C"};
        String [] s2={"A","B","B","C"};
        int i =s1.length-1;
        for(String s3:s1){
            int count=0;
            for(String s4:s1){
                if(s4.equals(s3)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s3);
            }

        }

    }
}
