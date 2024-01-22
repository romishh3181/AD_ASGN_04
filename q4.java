package ass4;

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,18,7,8};
        minmaxdiff(arr);
    }
    public static void minmaxdiff(int []arr){
        Arrays.sort(arr);
        int []minp=new int[2];
        int []maxp=new int[2];
        int mindiff=Integer.MAX_VALUE;
        int maxdiff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff<mindiff){
                mindiff=diff;
                minp[0]=arr[i];
                minp[1]=arr[i+1];
            }
            if(diff>maxdiff){
                maxdiff=diff;
                maxp[0]=arr[i];
                maxp[1]=arr[i+1];
            }
        }
        System.out.println("Min diff array pair:"+Arrays.toString(minp));
        System.out.println("Max diff array pair:"+Arrays.toString(maxp));
    }
}
