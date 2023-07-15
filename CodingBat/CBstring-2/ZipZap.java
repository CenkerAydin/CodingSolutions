package String_2;

public class ZipZap {
    public String oneTwo(String str){
        StringBuilder res=new StringBuilder();
        int length=str.length();
        int i=0;
       while (i<length){
           if (i<length-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
               res.append("zp");
               i+=3;
           }else {
               res.append(str.charAt(i));
               i++;
           }
       }
       return res.toString();
    }
}
