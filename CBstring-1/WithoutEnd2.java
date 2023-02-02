package String_1;
//https://codingbat.com/prob/p174254
public class WithoutEnd2 {
    public String withoutEnd2(String str){
        if (str.length()<=2)
            return "";
        else
            return str.substring(1,str.length()-1);
    }
}
