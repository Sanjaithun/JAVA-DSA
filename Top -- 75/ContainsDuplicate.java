import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate {

    boolean CheckContainsDuplicate(int[] Array,int size) {

        Set <Integer> seen = new HashSet<>();

        for (int num : Array) {
       
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}
