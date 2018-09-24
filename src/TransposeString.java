//4.     Write a program to transpose the given string.
//
//        Input String : a quick brown fox jumps over the lazy dog
//
//        Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
public class TransposeString {
    String userString;
    TransposeString(String input){
        userString=input;
    }
    String transposeAString(){
        StringBuilder str;
        String[] test=userString.split("\\s");
        String s=new String();
        for(int i=0;i<test.length;i++){
            str= new StringBuilder(test[i]);
            str.reverse();
            test[i]=new String(str);
            s=s+test[i]+" ";//toString gives an object back and can only be used to print so don't use it.
        }
        return(s.trim());
    }
}
