package WarmUp_2;
//https://codingbat.com/prob/p101475
public class FrontTimes {
    public String frontTimes(String str,int n){
        String result="";
        if (str.length()>=3){
            str=str.substring(0,3);
            while (n!=0){
                result +=str;
                n--;
            }
        }else {
            while (n!=0){
                result+=str;
                n--;
            }
        }
        return result;
    }
}
