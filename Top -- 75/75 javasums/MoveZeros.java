import java.util.*;

public class MoveZeros {
    List<Integer> move(int[] a) {
        
        List<Integer> res = new ArrayList<>();
        int countZero = 0;

        for (int i : a) {
            if (i == 0) {
                countZero++;
                continue;
            } else {
                res.add(i);
            }
        }

        for (int i = 0; i < countZero; i++) {
            res.add(0);
        }

        System.out.println(res);
        return res;
    }
}
