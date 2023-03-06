package Warmup_1;

public class everyNth {
    public String everyNth(String str,int n){
        String ch="";

        for (int i=0;i<str.length();i=i+n){
        ch+=str.charAt(i);
        }
        return ch;
    }
}
