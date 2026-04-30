import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate {

    static boolean CheckContainsDuplicate(int[] Array,int size) {

        ArrayList<Integer> seen = new ArrayList<>();

        for (int num : Array) {
       
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    static void main() {
        int[] array = {1,2,3,4,5};
        int len = array.length;
        System.out.println(CheckContainsDuplicate(array , len));

    }

}