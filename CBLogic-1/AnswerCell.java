package Logic_1;
//https://codingbat.com/prob/p110973
public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else {
            if (isMorning && isMom) {
                return true;
            } else if (isMorning && !isMom)
                return false;
            else if (!isMorning)
                return true;
        }
        return false;
    }

}