package day02_variables;

public class c5_artimethicOperators {

    public static void main(String[] args) {

        double doubled1 = 5.5;
        System.out.println(doubled1);
        double d1 = 5.5555555555;
        System.out.println(d1);
        float f1 = 2.5f; //java recognizes decimal numbers as default "double"
        //so if you want to use float you have to add f to the end of the number

        System.out.println("*********");
        System.out.println(2 + 5); //without the quotes it will actually calculate

        System.out.println("2+5");
        //only use double quotation for text or words
        System.out.println(doubled1 + d1); // you can add up your reserved words that
        //used like keys - don't use quotes unless you want it to print/read as words
        System.out.println(doubled1 / d1);  // you can use * or + or / or - to run different math
        System.out.println(10 % 3); // the percent sign % will give you the remainder in division


    }


}
