package String_1;
//https://codingbat.com/prob/p172063
public class ExtraFront {
    public String extraFront(String str){
        String res="";
        if (str.length()>=2){
            res=str.substring(0,2);
            return res+res+res;
        }else
            return str+str+str;
    }
}
