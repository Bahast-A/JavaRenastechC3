package day_15forloopeach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c3_arraydeeptostring {
    public static void main(String[] args) {
        int[] number={1,2,3};
        System.out.println(Arrays.toString(number));
        int[][] number20={{1,2},{2,3,4},{4}};
        System.out.println(Arrays.toString(number20));
        System.out.println(Arrays.toString(number20[0]));
        System.out.println(Arrays.deepToString(number20));

    }
}
