package Warmup_1;

public class loneTeen {
    public boolean loneTeen(int a,int b){
         if ((12<a &&a<20)|| (12<b && b<20)){
             if (!((12<a &&a<20) &&(12<b && b<20)))
                 return true;
         }
         return false;
    }
}
