package day06_javaaaaaaa;

public class c1_temary {
    public static void main(String[] args) {
        int score = 37;
        char grade = '0';
        String result = "";
        if (score >= 85 && score <= 100) {
            grade = 'A';

        } else if (score >= 70 && score < 85) {
            grade = 'B';
        } else if (score >= 60 && score < 70) {
            grade = 'C';
        } else if (score >= 40 && score < 60) {
            grade = 'D';
        } else if (score >= 0 && score < 40) {
            grade = 'F';
        } else {
            grade = '0';
        }
        result = "Student grade is " + grade;
        System.out.println(result);
    }
}