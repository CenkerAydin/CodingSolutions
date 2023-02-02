package String_1;
//https://codingbat.com/prob/p163411
public class FirstTwo {
    public String firstTwo(String str){
        int length =str.length();
        if (length<=1)
            return str;
        else
            return str.substring(0,2);
    }
}
