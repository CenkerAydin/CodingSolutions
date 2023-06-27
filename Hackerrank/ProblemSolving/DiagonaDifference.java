package ProblemSolving;

import java.util.List;

public class DiagonaDifference {

    public static int diagonalDifference(List<List<Integer>>arr){
        int left=0;
        int rigth=0;
        for (int i=0;i<arr.size();i++){
                left+=arr.get(i).get(i);
                rigth+=arr.get(i).get(arr.size()-1-i);

        }
        return Math.abs(left-rigth);
    }
}
