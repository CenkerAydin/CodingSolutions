package Logic_1;
//https://codingbat.com/prob/p177181
public class TeaParty {
    public int teaParty(int tea,int candy){
       if (tea>=5 && candy>=5){
            if (tea>=2*candy || candy>=2*tea) {
                return 2;
            }
            return 1;
       }else
          return 0;
    }
}
