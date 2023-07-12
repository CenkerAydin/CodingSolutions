package String_2;
//https://codingbat.com/prob/p126880
public class EndOther {
    public boolean endOther(String a,String b) {
        a= a.toLowerCase();
        b= b.toLowerCase();
       return (a.endsWith(b) || b.endsWith(a));
    }
}
