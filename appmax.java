package ass4;
import java.util.*;
import java.util.HashMap;

public class appmax {
    public static void main(String[] args) {
        int arr[]={2,4,4,5,8,9};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxfre=0;
        int maxnum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num= entry.getKey();
            int freq=entry.getValue();
            if(freq>maxfre){
                maxfre=freq;
                maxnum=num;
            }
        }
        System.out.println(maxnum);

    }
}
