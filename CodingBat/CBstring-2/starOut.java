package String_2;
//https://codingbat.com/prob/p139564
public class starOut {
    public String starOut(String str){
        StringBuilder res=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='*'){
               continue;
            }
            if (i>0 && str.charAt(i-1)=='*'){
                continue;
            }
            if (i < str.length()-1 && str.charAt(i+1)=='*'){
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();

    }
}
