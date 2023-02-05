package Array_1;
//https://codingbat.com/prob/p191991
public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        int sayiA=a.length;
        int sayiB=b.length;


        if(a[0]==b[0]||a[sayiA-1]==b[sayiB-1])
            return true;

        return false;
    }
}
