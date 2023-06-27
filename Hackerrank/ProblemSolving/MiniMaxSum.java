package ProblemSolving;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr){
        Collections.sort(arr);
        long min=0;
        long max=0;
        for (int i=0;i<arr.size()-1;i++){
            min+=arr.get(i);
        }
        for (int i=1;i<arr.size();i++){
            max+=arr.get(i);
        }
        System.out.println(min+" "+max);
    }
}
