package Warmup_1;

public class mixStart {
    public boolean mixStart(String str){
        if (str.length()>=3&&str.substring(1,3).equals("ix"))
            return true;
        else return false;
    }
}
