package day_15forloopeach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c2_multideminsionalarray {
    public static void main(String[] args) {
        //Datatype[] name={data1,data2,data3}
        int[] arr={1,2,3,4,5};
        System.out.println("arr 10 " + arr.length);
        int[][] arr2={{1,2,3},{0,2,4},{2,4}};
        System.out.println("arr 2d "+arr2.length);
        System.out.println(arr[3]);
        System.out.println(arr2[2][1]);
        System.out.println(arr2[1][2]);
        System.out.println("***************************8");
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);
        System.out.println("****************************");
        int[] container0=arr2[0];
        System.out.println(Arrays.toString(container0));
        System.out.println("======================");
        String[][]namelist={{"Ridvan","Recep","Bawer","ibrahim","suphi"},{"ozge","Meral","esra","ceran"}};
        String nameEsra=namelist[1][2];
        String nameSuphi=namelist[0][4];
        String [] malelist=namelist[0];
        String [] femalelist=namelist[1];
        System.out.println(nameSuphi);
        System.out.println(Arrays.toString(femalelist));
        System.out.println("***********************************");
        int[][][] number3d={ { {1,2,3},{4,5} },
                { {6},{7} },
                { {8} } };
        System.out.println(number3d[0][0][0]);
        System.out.println(number3d[1][0][0]);
        System.out.println(number3d[2][0][0]);





    }
}
