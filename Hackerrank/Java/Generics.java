package Java;
//https://www.hackerrank.com/challenges/java-generics/problem
public class Generics {
    public static void main(String[] args) {
        Integer[]a={1,2,3};
        String[]b={"Hello","World"};
        printArray(a);
        printArray(b);
    }
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }
}
