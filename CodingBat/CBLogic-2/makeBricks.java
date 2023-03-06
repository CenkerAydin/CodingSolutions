package Logic_2;
//https://codingbat.com/prob/p183562
public class makeBricks {
    public boolean makeBricks(int small,int big,int goal){
        if(small+5*big<goal){return false;}
        if(small+5*big==goal){return true;}
        int mod=goal%5;
        if(mod>small){return false;}
        return true;
    }
}
