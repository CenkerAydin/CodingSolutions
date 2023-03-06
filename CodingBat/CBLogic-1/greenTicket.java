package Logic_1;
//https://codingbat.com/prob/p120633
public class greenTicket {
    public int greenTicket(int a,int b,int c){
        if (a!=b && b!=c && c!=a)
            return 0;
         if (a==b && b==c)
            return 20;
         if ((a==b &&b!=c)||(a==c &&b!=c)||(b==c &&a!=c))
            return 10;
        return 0;
    }
}
