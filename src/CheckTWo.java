import java.util.HashMap;
//3. Write a program where an array of strings is input and output is a Map<String,boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array
//
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
public class CheckTWo {
    String userString;
    HashMap<String,Boolean > checksIfTwoOrMore(String input){
        HashMap<String,Boolean> userMap=new HashMap<>();
        //Integer or int doesn't matter because of autoboxing and unboxing for Maps
        userString=input;
        String[] testString=userString.split("\\s");
        for(String e:testString){
            if(userMap.get(e)==null){
                userMap.put(e,false);
            }else{
                userMap.put(e,true);
            }
        }
        System.out.println(userMap);
        return userMap;
    }
}
