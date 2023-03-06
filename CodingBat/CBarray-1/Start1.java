package Array_1;
//https://codingbat.com/prob/p109660
public class Start1 {
    public int start1(int[]a,int[]b){
        int count=0;
        if (a.length>=1) {
            if (a[0] == 1) count++;
        }
        if (b.length>=1) {
            if (b[0] == 1) count++;
        }
        return count;

    }
}
