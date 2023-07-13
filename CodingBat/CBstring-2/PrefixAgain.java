package String_2;
//https://codingbat.com/prob/p136417
public class PrefixAgain {
    public boolean prefixAgain(String str,int n){
        String pre=str.substring(0,n);
        return str.substring(1).contains(pre);
    }
}
