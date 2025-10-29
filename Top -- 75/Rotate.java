public class Rotate {
    int[] reverse(int[] S) {
        int[] res = new int[S.length];
        int j = 0;

        for (int i = S.length - 1; i >= 0; i--) {
            res[j] = S[i];
            j++;
        }
        return res;
    }
    
}

