//5. Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
//
//        Input: This is Harry.
//
//        Output: Is Harry here ? true
//
//        Input : This is Henry.
//
//        Output: Is Harry here ? false
public class HarryCheck {
    String userString;
    int lengthString;
    HarryCheck(String input){
        userString=input;
    }
    Boolean checkIfHarry(){
        if(userString.split("[hH]arry").length>1)
            return true;
        else
            return false;
    }
}
