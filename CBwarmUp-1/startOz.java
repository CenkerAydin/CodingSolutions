package Warmup_1;

public class startOz {
    public String startOz(String str){
        String str1="";
        if (str.length()>=2 &&str.substring(0,2).equals("oz"))
            return "oz";

        if (str.length()>=1 &&str.charAt(0)=='o'){
            str1=str1+str.charAt(0);
        }
        if (str.length()>=2 && str.charAt(1)=='z')
            str1=str1+str.charAt(1);

        return str1;

    }
}
