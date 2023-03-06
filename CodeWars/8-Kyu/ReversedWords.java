package CodeWars;

public class ReversedWords {
    static String reverseWords(String str){

        String[] temp=str.split("\\s");
        String result="";
        for (int i=0;i< temp.length;i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            } else {
                result = " " + temp[i] + result;
            }
        }
            return result;
    }
}
