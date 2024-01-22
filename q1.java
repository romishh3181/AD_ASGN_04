package ass4;

public class q1 {
    public static void main(String[] args) {
        int arr[]={2,5,6,8,2,5};
        System.out.println(frep(arr));
    }
    public static int frep(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
