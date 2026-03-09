public class ArraysMethods {

    int[] mergeArray(int[] nums1 , int[] nums2 , int n , int m){
        
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j] ){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        
// [1,2,2,3,5,6]

    }

    void RemoveElement(int[] array, int value){

        int i = 0;
        int j = 0;

        while(j < array.length){
            if(array[j] != value){
                array[i++] = array[j++];
            }
            else{
                j++;
            }
        }
    }

    int removeduplicate(int[] array){

        int i = 0;

        for(int j = 1; j < array.length;j++){

            if(array[i] != array[j]){
                array[++i] = array[j];
            }
        }
        return i;
    }

    int removedublicatetwice(int[] array){

        int i = 0;
        int check = 0;

        for(int j = 0; j < )

    }




}


