package Warmup_1;

public class BackAround {
    public String backAround(String str){
        String lastChar=str.substring(str.length()-1);
        return lastChar+str+lastChar;
    }
}
