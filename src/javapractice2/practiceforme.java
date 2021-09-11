package javapractice2;

public class practiceforme {
    public static void main(String[] args) {
        int i1=12;
        String Monthnames;
        switch(i1){
            case 1:Monthnames="Jan"; break;
            case 2:Monthnames="Feb"; break;
            case 3:Monthnames="March"; break;
            case 4:Monthnames="April"; break;
            case 5:Monthnames="May"; break;
            case 6:Monthnames="June"; break;
            case 7:Monthnames="July"; break;
            case 8:Monthnames="August"; break;
            case 9:Monthnames="September"; break;
            case 10:Monthnames="October"; break;
            case 11:Monthnames="November"; break;
            case 12:Monthnames="December"; break;
            default: Monthnames="Invalid number entered please check number";break;
        }
        System.out.println(Monthnames);
    }
}
