public class Quadrant8 {
    public static void main(String[] args) {
        System.out.println(quadrant(1,2));
        System.out.println(quadrant(10,-100));
        System.out.println(quadrant(-1,-9));
        System.out.println(quadrant(-5,6));
    }
    public static int quadrant(int x,int y){
        if (x>0 && y>0){
            return 1;
        }else if (x>0 && y<0){
            return 4;
        }else if (x<0 && y>0){
            return 3;
        }else
            return 2;
    }
}
