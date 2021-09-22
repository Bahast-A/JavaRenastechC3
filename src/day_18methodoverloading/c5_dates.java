package day_18methodoverloading;

import java.time.LocalDate;


public class c5_dates {
    public static void main(String[] args) {
    LocalDate localDate1=LocalDate.of(2021,10,01);
        System.out.println(localDate1);
        LocalDate localDate2=LocalDate.of(2020,6,5);
        System.out.println(localDate2);
        boolean b1=localDate1.isAfter(localDate2);
        boolean b2=localDate1.isBefore(localDate2);
        boolean b3=localDate1.isEqual(localDate2);
        System.out.println("b1 = "+ b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        LocalDate todayDate=LocalDate.now();
        System.out.println(todayDate);
        String todayDateString=todayDate.toString();
        todayDateString=todayDateString.replace("-",".");
        System.out.println("todayDateString = "+ todayDateString);

    }
}
