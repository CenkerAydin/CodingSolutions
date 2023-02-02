package String_1;
//https://codingbat.com/prob/p138183
public class LastChars {
    public String lastChars(String a,String b){
        String aFirst="";
        String bLast="";
        if (a.length()==0)
            aFirst="@";
        if (b.length()==0)
            bLast="@";
        if (a.length()!=0)
        aFirst=a.substring(0,1);
        if (b.length()!=0)
        bLast=b.substring(b.length()-1);
        return aFirst+bLast;
    }
}
