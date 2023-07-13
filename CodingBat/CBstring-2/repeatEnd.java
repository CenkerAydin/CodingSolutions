package String_2;
//https://codingbat.com/prob/p152339
public class repeatEnd {
    public String repeatEnd(String str,int n){
        String end=str.substring(str.length()-n);
        String res="";
        for (int i=0;i<n;i++){
            res +=end;
        }
        return res;
    }
}
