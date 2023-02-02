package String_1;
//https://codingbat.com/prob/p110141
public class DeFront {
    public String deFront(String str){
        if (str.startsWith("a")&& str.startsWith("ab"))
            return str;
        else if ((str.startsWith("a"))&&!(str.startsWith("ab")))
            return str.substring(0,1)+str.substring(2);
        else if (str.charAt(1)=='b')
            return str.substring(1);
        else
            return str.substring(2);
    }
}
