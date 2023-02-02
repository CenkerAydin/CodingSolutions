package String_1;
//https://codingbat.com/prob/p199216
public class seeColor {
    public String seeColor(String str){
       if (str.startsWith("red"))
           return "red";
       else if (str.startsWith("blue"))
           return "blue";
       else
           return "";
    }
}
