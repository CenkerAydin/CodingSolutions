package String_1;
//https://codingbat.com/prob/p108853
public class ExtraEnd {
    public String extraEnd(String str){
        int a=str.length();
        String res=str.substring(a-2,a);
        return res+res+res;
    }
}
