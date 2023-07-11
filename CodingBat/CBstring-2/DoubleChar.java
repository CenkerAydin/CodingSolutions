package String_2;
//https://codingbat.com/prob/p165312
public class DoubleChar {

    public String doubleChar(String str){
        String res="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            res+=c;
            res+=c;
        }
        return res;
    }
}
