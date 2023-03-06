package WarmUp_2;
//https://codingbat.com/prob/p142270
public class StringTimes {

        public static String stringTimes (String str,int n){
            String result = "";
            while (n != 0) {
                result += str;
                n--;
            }
            return result;
        }
    }

