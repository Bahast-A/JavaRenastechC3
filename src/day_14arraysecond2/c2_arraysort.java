package day_14arraysecond2;

import java.util.Arrays;

public class c2_arraysort {
    public static void main(String[] args) {
        int[] numberlist={2,4,6,4,8,9,33,32,26};
        System.out.println(Arrays.toString(numberlist));
        Arrays.sort(numberlist);
        System.out.println(Arrays.toString(numberlist));
        System.out.println("Min Number is "+ numberlist[0]);
        System.out.println("Max Number is "+ numberlist[numberlist.length-1]);
        System.out.println("Med number is "+numberlist[numberlist.length/2]);
    }
}
