package Warmup_1;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("ab"));
    }
    public static String front3(String str){

        String front="";
        if (str.length()<3)
             front=str.substring(0,str.length());
        else
            front=str.substring(0,3);


        return front+front+front;
    }
}
