package Warmup_1;

public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday==false || vacation ==true)
            return true;

        return false;
    }
}
