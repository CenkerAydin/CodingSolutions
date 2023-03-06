package WarmUp_2;
//https://codingbat.com/prob/p171260
public class StringX {
    public String stringX(String str) {
        String x = "";
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (!(i>0 &&(i<length-1)&&str.substring(i,i+1).equals("x"))){
                x +=str.substring(i,i+1);
            }
        }
        return x;
    }
}