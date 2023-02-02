package String_1;
//https://codingbat.com/prob/p139075
public class HasBad {
    public boolean hasBad(String str){
        if (str.length()==0)
            return false;
        if (str.charAt(0)=='b'||str.charAt(1)=='b')
            return true;

        return false;
    }
}
