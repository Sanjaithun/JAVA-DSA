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

    static int[] inplace(int[] array){
        int len = array.length;
         int i = 0;
         int j = 0;
         while(i < len){
             if(array[i] != 0){
                 array[i++] = array[j++];
             }
             else{
                 while()
             }

         }
        return array;
    }

    static void main() {
        System.out.println(Arrays.toString(inplace(new int[]{1,2,0,0,3,4,0})));
    }
}
