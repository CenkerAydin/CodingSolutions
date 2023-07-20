package WarmUp_2;

public class StringMatch {
    public int stringMatch(String a,String b){
       int minL=Math.min(a.length(),b.length());
       int count=0;
       for (int i=0;i<minL-1;i++){
           if (a.substring(i,i+2).equals(b.substring(i,i+2)))
               count++;
       }
       return count;
    }
}
