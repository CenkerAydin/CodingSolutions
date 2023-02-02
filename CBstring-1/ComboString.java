package String_1;
//https://codingbat.com/prob/p168564
public class ComboString {
    public String comboString(String a,String b){
        int aLenght=a.length();
        int bLength=b.length();
        if (bLength>aLenght)
            return a+b+a;
            else
                return b+a+b;
    }
}
