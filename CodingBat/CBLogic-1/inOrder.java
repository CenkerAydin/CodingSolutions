package Logic_1;
//https://codingbat.com/prob/p154188
public class inOrder {
    public boolean inOrder(int a,int b,int c,boolean bOk){
        if (bOk){
            if (c>b)
                return true;
        }else if (b>a && c>b ) {
            return true;
        }

            return false;
    }
}
