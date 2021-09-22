package day_16continuancer01;

public class c5_reversedString {
    public static void main(String[] args) {
        reverseString("Hello world");
        String name1="Ridvan Oral";
        reverseString(name1);
        int i1=25;

    }
    public static void reverseString(String name){
        String result="";
        for(int i=name.length()-1;i>0;i--){
            result += name.charAt(i);

        }
        System.out.println(result);

    }


}
