package String_2;
//https://codingbat.com/prob/p109637

public class RepeatSeparator {
    public String repeatSeparator(String word,String sep,int count){
        String res="";
        if (count==0) return "";
        if (count==1) return word;
        for (int i=1;i<count;i++){
            res +=word;
            res +=sep;
        }
        res+=word;
        return res;
    }
}
