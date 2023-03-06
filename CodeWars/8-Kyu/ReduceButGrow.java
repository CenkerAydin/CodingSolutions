package CodeWars;

public class ReduceButGrow {
    public static int grow(int[] x){
    int multi=1;
    for(int i=0;i<x.length;i++){
        multi*=x[i];
    }
    return multi;
}
}
