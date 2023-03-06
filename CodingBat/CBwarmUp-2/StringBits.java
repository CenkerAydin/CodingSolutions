package WarmUp_2;
//https://codingbat.com/prob/p165666
public class StringBits {
    public String stringBits(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }
}
