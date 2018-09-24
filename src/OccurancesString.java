//1.     Write a java program to count the total number of occurrences of a given character
//       in a string without using any loop?
//       For Example- Java is java again java again count number of occurrence of a in the given stringpublic
class OccurancesString {
    String userString;
    int stringLength;
    OccurancesString(String input){
        userString=input;
        stringLength=userString.length();
    }
    int checkOccurances(String checkChar){
        int length;
        String[] testString;
        if(checkChar.length()>1){
            testString=userString.split(" ");
            length=testString.length-userString.replaceAll(checkChar,"").split(" ").length;
        }
        else{
            testString=userString.split("");
            length=testString.length-userString.replaceAll(checkChar,"").length();
        }
        return length;
    }

}
