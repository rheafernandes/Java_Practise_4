import java.util.HashMap;
//5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2. Modify and return the given map as follows:
//
//        a. If the key `val1` has a value, set the key `val2` to have that value, and
//        b. Set the key `val1` to have the value `"  "` (empty string).
//        Example 1:
//        The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2": "java"}
//        Example 2:
//        The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2": "mars"}

//The string array of replacementKeys hold all the keys that can be replaced.
public class ModifyMap {
    HashMap<String,String> modifyReturn (HashMap<String,String> userMap, String[] replacementKey,String[] replaceKey){
        for(int i=0;i<replacementKey.length;i++){
            if(userMap.get(replacementKey[i])!=null){
                userMap.replace(replaceKey[i],userMap.get(replacementKey[i]));
                userMap.replace(replacementKey[i],"");
            }
        }
        return userMap;
    }
}
