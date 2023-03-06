package CodeWars;

public class VovelRemover {
   public static String shortcut(String input) {
       String newStr=input.replaceAll("[aeiou]","");
       return newStr;
        }
}
