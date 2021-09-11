package day9_moremorejava;

public class c1_stringmethods {
    public static void main(String[] args) {
        String sentence="Hello world..Java is here llllo";
        char ch=sentence.charAt(3);
        //starts from 012345 - string placement start with number 0
        System.out.println(ch);
        System.out.println(sentence.charAt(1));
        System.out.println(sentence.indexOf("l"));// it will give you the number of the first L in the string so its 2
        System.out.println(sentence.indexOf("ll")); //still be 2 because it starts with 2nd in the string
        int LastIndex=sentence.indexOf("lllo");
        System.out.println(LastIndex+2);// this is what we have to do to get the number of the last lo in the string sentence

    }
}
