package ass4;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int []num={1,2,3,5,6};
        System.out.println(miss(num));
    }
    public static int miss(int[] arr){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int acsum= Arrays.stream(arr).sum();
        return sum-acsum;
    }
}
