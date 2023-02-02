package String_1;
//https://codingbat.com/prob/p174148
public class nTwice {
    public String nTwice(String str,int n){
        return str.substring(0,n)+str.substring(str.length()-n);


    }
}
