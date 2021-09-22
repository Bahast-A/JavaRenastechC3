package day_11letsgo.day_13arraytopicsoi;

public class c3_ARRAYS2 {
    public static void main(String[] args) {
        int [] arr={5,-15,25};
        System.out.println(arr.length);
        int[]arr2=new int[20];
        System.out.println(arr[2]);
        //store numbers from 3 to 22
        for(int i=0;i<=arr2.length-1;i++){
            arr2[i]=i+3;
            System.out.println(arr2[i]);

        }
        System.out.println("***************");
        int [] numbers={4,8,12};
        System.out.println(numbers[1]);
        numbers[1]=5;
        System.out.println(numbers[5]);//we just reassigned index1 to 5


    }
}
