package ProblemSolving;
//https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer>b){
        int countA=0;
        int countB=0;
        for (int i=0;i<a.size();i++){
            if (a.get(i) >b.get(i)){
                countA++;
            }else if (a.get(i)<b.get(i)) {
                countB++;
            }else{
            }
        }
        List<Integer>res=new ArrayList<>();
        res.add(countA);
        res.add(countB);

        return  res;

    }
}
