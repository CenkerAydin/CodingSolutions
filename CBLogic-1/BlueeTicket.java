package Logic_1;
//https://codingbat.com/prob/p192267
public class BlueeTicket {
    public int blueTicket(int a,int b,int c){
    int pair1=a+b;
    int pair2=a+c;
    int pair3=b+c;
    if (pair1==10 || pair2==10 || pair3==10)
        return 10;
    if (pair1 >=pair2+10 || pair1>=pair3+10)
        return 5;

    return 0;
    }
}
