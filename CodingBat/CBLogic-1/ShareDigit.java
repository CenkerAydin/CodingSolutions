package Logic_1;
//https://codingbat.com/prob/p153748
public class ShareDigit {
    public boolean shareDigit(int a,int b){
        int aDigit1=a%10;
        a/=10;
        int aDigit2=a%10;
        int bDigit1=b%10;
        b/=10;
        int bDigit2=b%10;
        if (aDigit1==bDigit1 || aDigit1==bDigit2 ||
                aDigit2==bDigit1 || aDigit2==bDigit2)
            return true;

        return false;

    }
}
