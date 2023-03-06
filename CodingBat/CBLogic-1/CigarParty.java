package Logic_1;
//https://codingbat.com/prob/p159531
public class CigarParty {

    public boolean cigarParty(int cigars,boolean isWeekend){
        if (40<=cigars && cigars<=60 )
            return true;
        else if (40<=cigars &&isWeekend)
            return true;
        else return false;
    }
}
