
import java.util.*;



public class RemoveDuplicate {
    List<Integer> dup(int[] array){


        List<Integer> list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        return list;


    }
}
