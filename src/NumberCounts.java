import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberCounts {
    String userString;
    HashMap<String, Integer> countNumberRepeat(String input){
        HashMap<String,Integer> userMap=new HashMap<>();
        //Integer or int doesn't matter because of autoboxing and unboxing for Maps
        userString=input;
        String[] testString=userString.split("[^a-zA-Z]+");
        for(String e:testString){
            if(userMap.get(e)==null){
                userMap.put(e,1);
            }else{
                userMap.put(e,userMap.get(e)+1);
            }
        }
        System.out.println(userMap);
        return userMap;
    }
}
