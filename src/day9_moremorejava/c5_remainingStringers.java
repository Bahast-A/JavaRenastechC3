package day9_moremorejava;


public class c5_remainingStringers {
    public static void main(String[] args) {
        String word = "Hello world 123 hello world 123";
        //replace()              Searches a string for a specified value, and returns
        //                      a new string where the specified values are replaced               String

        //remove all e from word and pass x as a replecment
        System.out.println(word.replace("e", "x"));
        System.out.println(word);

        //remove all world from sentence and replace with planet
        System.out.println(word.replace("world", "planet"));
        System.out.println(word);//since we didnt reassigned this wont change

        word = word.replace("o", "");
        System.out.println(word);


        //replaceFirst()         Replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement                String

        String str = "Java is here , planet is Java , Java is planet";

        //replacefirst will only replace first matching one
        String newStr = str.replaceFirst("Java", "Python");
        System.out.println(newStr);

        //replace will replace all the matching ones
        System.out.println(str.replace("Java", "Python"));

        System.out.println(str.replace("Java ,", "Python ,"));
        String sentence = "Java Hello Java 123 World";
        boolean b1 = sentence.startsWith("Java ") || sentence.endsWith("Java"); //true becuz its or
        boolean b2 = sentence.startsWith("Java") && sentence.endsWith("Java"); // false becuz its and
        if (b1) {
            System.out.println("Sentence either starting or ending with Java");
            if (b2) {
                System.out.println("Sentence is starting and ending with Java");
            } else {
                System.out.println("Sentence doesn't start and end with Java");
            }
        } else {
            System.out.println("Sentence doesn't start or end with Java");
        }
        String letters = "Hello world java";
        System.out.println(letters.substring(6));
        System.out.println(letters.substring(6, 10));//last placement won't be included have to go to 11
        System.out.println(letters.substring(6, 10 + 1)); //this was adding the 1 covers to the next placement
        System.out.println(letters.substring(0, 10 + 1)); // to print hello world
        int indexofjava = letters.indexOf("j");
        System.out.println(indexofjava);
        System.out.println();


    }
}
