package Logic_1;
//https://codingbat.com/prob/p169213
public class LastDigit {
public boolean LastDigit(int a,int b,int c){
    int aDigit=a%10;
    int bDigit=b%10;
    int cDigit=c%10;
    if (aDigit==bDigit || aDigit==cDigit || bDigit==cDigit)
        return true;

    return false;
}
}
