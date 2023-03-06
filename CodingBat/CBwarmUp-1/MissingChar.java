package Warmup_1;

public class MissingChar {
    public String missingChar(String str,int n){
        String str1=str.substring(0,n);
        String str2=str.substring(n+1,str.length());
        return str1+str2;
    }
}
