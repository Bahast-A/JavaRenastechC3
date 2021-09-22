package practicewithfirasity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c5932_firas {
    public static void main(String[] args) {

        System.out.println(sleepin(true,false));
    }
    public static String sleepin(boolean weekday,boolean vacation){
        String [] s1={"monday","tuesday","wednesday","thursday","friday"};
        String [] s2={"saturday","sunday"};

        weekday=true;
        vacation=true;
        String result="";
        if(!weekday || vacation){

            result=" We sleep in on these days"+Arrays.toString(s2);}


            else{

            result=" We don't sleep in on these days "+ Arrays.toString(s1);
            }


            return result;

    }
}
