public class AlphabeticallyOrdered7 {
    public static boolean isAlphabeticalOrder(String str){
        str=str.toLowerCase();

        for (int i=0;i<str.length()-1;i++){
            char current=str.charAt(i);
            char next=str.charAt(i+1);
            if (current >next) return false;
        }
     return true;
    }

}
