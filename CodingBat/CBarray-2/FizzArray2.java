package Array_2;
//https://codingbat.com/prob/p178353
public class FizzArray2 {
    public String[]fizzArray2(int n){
        String[]res=new String[n];
        for (int i=0;i< res.length;i++){
            res[i]= ""+i+"";
        }
        return res;
    }
}
