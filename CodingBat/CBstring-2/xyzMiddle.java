package String_2;
//https://codingbat.com/prob/p159772
public class xyzMiddle {
    public boolean xyzMiddle(String str){
        int length = str.length();
        if (length < 3) {
            return false;
        }
        int middle = length / 2;
        if (length % 2 != 0) {
            return str.substring(middle - 1, middle + 2).equals("xyz");
        }
        return str.substring(middle - 1, middle + 2).equals("xyz")
                || str.substring(middle - 2, middle + 1).equals("xyz");
    }
}
