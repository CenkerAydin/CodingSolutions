package String_1;
//https://codingbat.com/prob/p143825
public class NonStart {

    public String nonStart(String a,String b){
        String aRes=a.substring(1);
        String bRes=b.substring(1);
        return aRes.concat(bRes);
    }
}
