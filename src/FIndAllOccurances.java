import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
//
//        Input : She sells seashells by the seashore
//
//        Given word: se
//
//        Output :
//
//        Found at: 4 - 6
//
//        Found at: 10 - 12
//
//        Found at: 27 - 29
public class FIndAllOccurances {
    String userString;
    FIndAllOccurances(String input){
        userString=input;
    }
    void showAllOccurances(String givenCheck){
        Pattern pattern = Pattern.compile(givenCheck);
        Matcher matcher = pattern.matcher(userString);
        while (matcher.find()) {
            System.out.println("Found at: "+matcher.start()+" - "+matcher.end());
        }

    }

    public static void main(String[] args) {
        FIndAllOccurances testObj=new FIndAllOccurances("She sells seashells by the seashore");
        testObj.showAllOccurances("se");
    }

}
