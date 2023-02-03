package Logic_1;
//https://codingbat.com/prob/p115233
public class withoutDoubles {
    public int withoutDoubles(int die1,int die2,boolean noDoubles){
        if (noDoubles &&die1==6&&die2==6)
            return 7;
        if (die1==6 &&die2==6)
            return 12;
        if (noDoubles &&die1==die2)
            return die1+die2+1;

        return die1+die2;
    }
}
