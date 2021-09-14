package day06_javaaaaaaa;

public class c4_statementtypeanothaone {
    public static void main(String[] args) {
        int number = 10;
        String monthname;
        switch (number) {
            case 1:
                monthname = "Jan";
                break;
            case 2:
                monthname = "Feb";
                break;
            case 3:
                monthname = "March";
                break;
            case 4:
                monthname = "April";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname = "September";
                break;
            case 10:
                monthname = "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
                break;
            default:
                monthname = " Invalid number entered please check number";
                break;

        }
        System.out.println(monthname);
    }
}
