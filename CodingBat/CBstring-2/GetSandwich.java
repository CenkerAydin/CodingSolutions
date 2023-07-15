package String_2;
//https://codingbat.com/prob/p129952
public class GetSandwich {
    public String getSandwich(String str){
        String bread="bread";
        int firstBread=str.indexOf(bread);
        int lastBread=str.lastIndexOf(bread);

        if (firstBread !=-1 && lastBread !=-1 && firstBread !=lastBread){
            return str.substring(firstBread+bread.length(),lastBread);
        }else
            return "";
    }
}
