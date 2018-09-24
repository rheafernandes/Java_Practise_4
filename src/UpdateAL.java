import java.util.ArrayList;

//1. Write a Java program to update specific array element by given element and empty the array list.
//
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list after removing all elements []
public class UpdateAL {
    ArrayList<String> userList;

    ArrayList<String> updateList(String input, String[] replacement,int[] indexReplace){
        userList=new ArrayList<>();
        String[] userInput=input.split(",\\s");
        for(int i=0;i<userInput.length;i++){
            userList.add(userInput[i]);
        }
        for(int i=0;i<replacement.length;i++){
            userList.set(indexReplace[i],replacement[i]);
        }
        return  userList;

    }

}
