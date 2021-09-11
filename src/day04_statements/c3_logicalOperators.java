package day04_statements;

import java.sql.SQLOutput;

public class c3_logicalOperators {
    public static void main(String[] args) {
        //&& -- and
        // or
        //! -- opposite
        System.out.println( (5>3) && (3>5) );
        System.out.println( (10>5) && (0==0));
        System.out.println( (1==2) && (2!=2));
        System.out.println( (10>=10) && (10<=10));

        System.out.println();// ok so or is the shift key and the / key together
        System.out.println( (5>3) || (3>5) );
        System.out.println( (10>5) || (0==0));
        System.out.println( (1==2) || (2!=2));
        System.out.println( (10>=10) || (10<=10));

    }
}
