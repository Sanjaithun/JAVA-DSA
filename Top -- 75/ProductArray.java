public class ProductArray {
    int[] checkProductArray(int[] Array,int size){
        int left = 1;
        int right = 1;
        int[] result = {1,1,1,1,1};
        for (int i = 0; i < size; i++) {
            result[i] *= left;
            left *= Array[i];
            result[size - i - 1] *= right;
            right *= Array[size - i -1];
        }


        return result;
    }   
}
// this is a Big(O(n)) and more optimal solution