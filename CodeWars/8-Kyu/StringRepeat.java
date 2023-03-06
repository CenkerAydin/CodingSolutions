package CodeWars;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
    String strRep="";
    for(int i=1;i<=repeat;i++){
        strRep+=string;
    }
    return strRep;
}
}
