package Logic_1;
//https://codingbat.com/prob/p141061
public class SquirrelParty {
    public boolean squirrelParty(int temp,boolean isSummer){
        if (60<=temp && temp<=90)
            return true;
        else if (isSummer && 60<=temp &&temp<=100) {
            return true;
        }
        return false;
    }
}
