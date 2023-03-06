package Logic_1;
//https://codingbat.com/prob/p170833
public class RedTicket {
    public int redTicket(int a,int b,int c){
        if (a==2 &&b==2 &&c==2)
            return 10;
        if (a==b &&b==c)
            return 5;
        if (b!=a &&c!=a)
            return 1;

        return 0;
    }
}
