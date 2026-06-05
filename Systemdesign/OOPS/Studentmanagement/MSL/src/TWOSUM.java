import java.util.*;
public class TWOSUM {
    static void main() {
        int[] arr = {2,7,9,11};
        int tar = 10;
        HashMap<Integer,Integer> prevsum = new HashMap<>();
        int prevval;
        int len = arr.length;
        for(int i = 0;i < len;i++){
            prevval = tar - arr[i];
            if(prevsum.containsKey(prevval)){
                System.out.println(prevval +" " + arr[i]);
                break;

            }
            prevsum.put(arr[i],i);
        }
    }
}
