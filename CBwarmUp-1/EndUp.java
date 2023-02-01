package Warmup_1;

public class EndUp {
    public String endUp(String str){
        if (str.length() <= 3) return str.toUpperCase();
        int pos= str.length() - 3;
        String front = str.substring(0, pos);
        String back  = str.substring(pos);  // this takes from cut to the end

        return front + back.toUpperCase();
    }
}
