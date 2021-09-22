package day_14arraysecond2;

import java.util.Arrays;

public class c4_arraysqual {
    public static void main(String[] args) {


        int[] arr1 = {3, 5, 7};
        int[] arr2 = {5, 3, 7};
        int[] arr3 = {3, 5, 7};
        int[] arr4 = {3, 4, 7};
        boolean b1 = Arrays.equals(arr1, arr2);
        boolean b2 = Arrays.equals(arr1, arr3);
        boolean b3 = Arrays.equals(arr2, arr3);
        boolean b4 = Arrays.equals(arr1, arr4);
        System.out.println(b1+" , "+b2+" , "+b3+" , "+b4);
        System.out.println("*********************************");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        boolean b11 = Arrays.equals(arr1, arr2);
        boolean b12 = Arrays.equals(arr1, arr3);
        boolean b13 = Arrays.equals(arr2, arr3);
        boolean b14 = Arrays.equals(arr1, arr4);
        System.out.println(b11+" , "+b12+" , "+b13+" , "+b14);


        System.out.println();




    }
}
