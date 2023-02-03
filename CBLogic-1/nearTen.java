package Logic_1;
//https://codingbat.com/prob/p193613
public class nearTen {
    public boolean nearTen(int num){
        if (num%10<=2 || num%10>=8)
            return true;

        return false;
    }
}
