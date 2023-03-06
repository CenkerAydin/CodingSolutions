package Warmup_1;

public class FrontBack {
    public String frontBack(String str){
        if(str.length()<=1)
            return str;

        String middle=str.substring(1,str.length()-1);
        return str.charAt(str.length()-1)+middle+str.charAt(0);
    }
}
