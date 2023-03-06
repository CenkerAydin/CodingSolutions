package Logic_1;
//https://codingbat.com/prob/p137136
public class FizzString {
    public String fizzString(String str){
        if (str.startsWith("f")&& str.endsWith("b"))
            return "FizzBuzz";
        if (str.startsWith("f"))
            return "Fizz";
        if (str.endsWith("b"))
            return "Buzz";

        return str;
    }
}
