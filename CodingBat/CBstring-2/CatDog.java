package String_2;
//https://codingbat.com/prob/p111624
public class CatDog {
    public boolean catDog(String str){
        int countCat=0;
        int countDog=0;
        for (int i=0;i<str.length()-2;i++){
            if (str.substring(i,i+3).equals("cat")){
                countCat++;
            }
            if (str.substring(i,i+3).equals("dog")){
                countDog++;
            }
        }
        return countCat==countDog;
    }
}
