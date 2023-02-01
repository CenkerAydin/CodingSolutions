package Warmup_1;

public class Front22 {
    public String front22(String str){
        String front="";
        if (str.length()<3)
            front=str.substring(0,str.length());
        else
            front=str.substring(0,2);


        return front+str+front;
    }
}
