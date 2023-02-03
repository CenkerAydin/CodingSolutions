package Logic_1;
//https://codingbat.com/prob/p157733
public class CaughtSpeeding {

    public int caughtSpeeding(int speed,boolean isBirthday){
        if (isBirthday){
            if (speed<=65)
                return 0;
            else if (66<=speed && speed<=85)
                return 1;
            else
                return 2;
        }else
            if (speed<=60)
            return 0;
        else if (61<=speed && speed<=80)
            return 1;
        else
            return 2;
    }
}
