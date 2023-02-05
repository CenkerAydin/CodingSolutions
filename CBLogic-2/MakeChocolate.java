package Logic_2;
//https://codingbat.com/prob/p191363
public class MakeChocolate {
    public int makeChocolate(int small,int big,int goal){
        int x=goal%5;
        if (x>small) return -1;
        if (big*5+small<goal) return -1;

        if (big*5>goal)return x;
        return goal-(big*5);
    }
}
