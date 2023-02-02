package String_1;
//https://codingbat.com/prob/p105745
public class MinCat {
    public String minCat(String a,String b){
        int x=a.length();
        int y=b.length();
        if (x!=y){
            if (x>y)
                return a.substring(a.length()-y).concat(b);
            else
                return a.substring(a.length()-x).concat(b.substring(b.length()-x));
        }else
            return a.concat(b);
    }
}
