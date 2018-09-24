//2.     Write a program to replace all d with f and all l with t in the given String
//
//        Input: daily dry
//
//        Output: faity fry
//
//        Original string: daily dry
//
//        New String: faity fry

public class ReplaceChar {
    String userString;

    ReplaceChar(String input){
        userString=input.toLowerCase();
    }
    String replaceChar(){
        return userString.replaceAll("d","f").replaceAll("l","t");
    }
}
