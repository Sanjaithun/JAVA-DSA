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
    int[] findmaxmin(int[] array){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : array){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        int[] res = {min,max};
        return res;

    }
    int[] findmaxminwhile(int[] a){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int i = 0 , j = a.length-1;

        while(i < j){

            if(a[i] > max){
                max = a[i];
            }
            if(a[j] > max){
                max = a[j];
            }
            if(a[i] < min){
                min = a[i];
            }
            if(a[j] < min){
                min = a[j];
            }
            i++;
            j--;


        }
        int[] res = {min,max};
        return res;

    }

}




// sir is enough for leetcode 150 sums concepts to cover and those algorithms used

