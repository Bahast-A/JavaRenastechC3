package day9_moremorejava;

public class c3_moreandmorestringers {
    public static void main(String[] args) {
        String word="azmer";
        System.out.println(word.isEmpty());//false
        String word2="";
        boolean b1=word2.isEmpty();//this is true
        String word3=" ";
        boolean b2=word3.isEmpty();
        System.out.println(b1);//true cuz it is empty
        System.out.println(b2);//false becuz string isn't empty
        String name="recep";
        System.out.println(name.length());
        int lastIndex=name.lastIndexOf("p");
        System.out.println("Last index of name "+lastIndex);
        System.out.println(name.charAt(4));
        //System.out.println(name.charAt(5)); no placement for 5 won't work

    }
}
