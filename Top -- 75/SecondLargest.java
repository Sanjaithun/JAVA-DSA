public class SecondLargest {
    int SecondLargestElement(int[] array){
        
        int maxi = Integer.MIN_VALUE;
        int i = 0 , j = array.length - 1;
        while( i <= j){
            if(array[i] > maxi){
                maxi = array[i];
            }
            if(array[j] > maxi){
                maxi = array[j];
            }
            i++;
            j--;
        }
        int k = 0 , l = array.length - 1;
        int res = Integer.MIN_VALUE;
        while( k <= l){
            if(array[k] > res && array[k] != maxi){
                res = array[k];
            }
            if(array[l] > res && array[l] != maxi){
                res = array[l];
            }
            k++;
            l--;
        }
        return res;
    }
}
