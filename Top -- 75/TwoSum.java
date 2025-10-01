import java.util.HashMap;
public class TwoSum {
    int[] checkTwoSum(int[] array,int size,int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int compleiment = target - array[i];
            if(map.containsKey(compleiment)){
                return new int[]{compleiment,array[i]};
            }
            map.put(array[i], i);
        }
        return new int[]{0,0};
    }
}
