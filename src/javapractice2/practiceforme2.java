package javapractice2;

public class practiceforme2 {
    public static void main(String[] args) {

        int age = 12;

        String grade;
        switch(age){
            case 1:grade="First_Grade"; break;
            case 2:grade="Second_Grade"; break;
            case 3:grade="Third_Grade"; break;
            case 4:grade="Fourth_Grade"; break;
            case 5:grade="Fifth_Grade"; break;
            case 6:grade="Sixth_Grade"; break;
            case 7:grade="Seventh_Grade"; break;
            case 8:grade="Eighth_Grade"; break;
            case 9:grade="Freshmen"; break;
            case 10:grade="Sophmore"; break;
            case 11:grade="Junior"; break;
            case 12:grade="Senior"; break;
            default: grade="Invalid";break;
        }
        System.out.println(grade);
    }
}
