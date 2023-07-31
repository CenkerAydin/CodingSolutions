package ProblemSolving;

import java.util.List;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Arrays2D{

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        System.out.println(findMax(arr));
    }

    public static int findMax (List<List<Integer>> arr){
        int numRow=arr.size();
        int numCol= arr.get(0).size();
        int max=Integer.MIN_VALUE;

        for (int i=0;i<numRow-2;i++){
            for (int j=0;j<numCol -2;j++){
                int sum= arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                max=Math.max(max,sum);
            }
        }
        return max;
    }

}



