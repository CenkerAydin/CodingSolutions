package Array_1;
//https://codingbat.com/prob/p112409
public class Reverse3 {
    public int[] reverse3(int[] arr) {
        for (int i=0;i<arr.length/2 ;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length -i-1];
            arr[arr.length-i-1]=temp;
        }
        return arr;
    }

}
