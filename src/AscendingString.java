import java.util.Arrays;
//3.     Write a program that sets up a String variable containing a paragraph of text of your choice.
//
//        a. Extract the words from the text and sort them into alphabetical order.
//
//        b. Display the sorted list of words.
public class AscendingString {
    String[] names;
    AscendingString(String input){
        names=input.split("\\s");
    }
    String[] checkAscending(){
        Arrays.sort(names);
        return names;
    }
}
