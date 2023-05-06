public class RichestCustomer {
    public int maximumWealth(int[][]accounts){
        int[]res=new int[accounts.length];
        for (int i=0;i<accounts.length;i++){
            for (int j=0;j<accounts[0].length;j++){
                res[i]+=accounts[i][j];
            }
        }
        int max= res[0];
        for (int i=1;i<res.length;i++){
            if (res[i]>max)
                max=res[i];
        }
        return max;
    }
}
