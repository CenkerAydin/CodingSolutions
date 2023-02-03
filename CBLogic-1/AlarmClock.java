package Logic_1;
//https://codingbat.com/prob/p160543
public class AlarmClock {
    public String alarmClock(int day,boolean vacation){
    if (vacation) {
        if (1<= day && day <= 5)
            return "10:00";
        else if (day==0|| day==6)
            return "off";
    }else {
        if (1 <= day && day <= 5)
            return "7:00";
        else if (day == 0 | day == 6)
            return "10:00";
    }
    return "";
    }
}
