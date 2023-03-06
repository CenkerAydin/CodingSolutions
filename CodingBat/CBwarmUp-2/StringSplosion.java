package WarmUp_2;
//https://codingbat.com/prob/p117334
public class StringSplosion {
    public String stringSplosion(String str){
        String result="";
        for (int i=0;i<str.length();i++){
            result+=str.substring(0,i);
        }
        result +=str;
        return result;
    }
}
