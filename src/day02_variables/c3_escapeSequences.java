package day02_variables;

public class c3_escapeSequences {

    // escape sequences - \t: paragraph space - \n: new line
    // \": prints double quote " on the console


    public static void main(String[] args) {

        System.out.println("Renastech");

        System.out.println("\tRenastech"); // the \t will add a space before it prints the word

        System.out.println("Hello World");

        System.out.println("Hello \n World");  // because of \n its gonna put world on new line

        System.out.println("\\"); // the \\ will print just one of either "\" or "/"

        System.out.println("Today is \"Tuesday \" ."); // This is to quote something with ""

        System.out.println("Today is \'Tuesday \' ."); // This is to quote something with ''

    }


}