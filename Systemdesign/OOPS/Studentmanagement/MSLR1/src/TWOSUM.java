import java.util.HashMap;

public class TWOSUM {
    static void main() {
        System.out.println("MSL");
        int[] array = {2,7,9,11};
        int target = 20;
        HashMap<Integer,Integer> mapping = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            int compliment = target - array[i];
            if(mapping.containsKey(compliment)){
                System.out.println(mapping.get(compliment) +"  "+ i);
                break;
            }
            mapping.put(array[i] , i);
        }
    }
}
