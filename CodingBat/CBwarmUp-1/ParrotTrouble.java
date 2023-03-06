package Warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking==true &&(hour<7 || hour>20))
            return true;

        return false;
    }
}
