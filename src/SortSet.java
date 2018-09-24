import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//6. Write a program to implement set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list
//
//        Input : Harry  Olive  Alice  Bluto  Eugene
//        Output :
//        Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
//        Array list from Set :  Alice Bluto Eugene Harry Olive
public class SortSet {
    List<String> sortInput(String input){
        String[] testString=input.split("[^A-Za-z]+");
        TreeSet<String> testTree=new TreeSet<>();
        for(int i=0;i<testString.length;i++){
            testTree.add(testString[i]);
        }
        System.out.println("Sorted Set:"+testTree);
        return(new ArrayList<>(testTree));
    }
}
