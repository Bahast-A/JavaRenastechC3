package day02_variables;

public class c1_printvsprintln {

    public static void main(String[] args) {
        //first line
        System.out.println("This is println"); //println will break the current line

        //Second line
        System.out.print("--this is print"); //print will never break the line
        //it will continue same line that you are using

        //second line
        System.out.print("--continue to print");

        //So as long as you don't add "ln" to print it will keep it all on the same line
        System.out.print("--continue print 2");

        System.out.println("println2");
        //the secnd println2 will close off that group but now whatever you do after
        //will start a seperate line

        System.out.print("print 3"); // since i used print tho it will not start
        //a new line unless i do println after this one so if i continue it will be
        //batched together with this one

        System.out.println("println3");


    }


}
