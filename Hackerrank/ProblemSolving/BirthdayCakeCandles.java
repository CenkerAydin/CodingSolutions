package ProblemSolving;
//https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer>candles){
        int max=candles.get(0);
        for (int i=1;i<candles.size();i++){
            if (candles.get(i)>max)
                max=candles.get(i);
        }
        int count=0;
        for (int i=0;i<candles.size();i++){
            if (candles.get(i)==max)
                count++;
        }
        return count;
    }
}
