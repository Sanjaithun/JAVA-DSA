public class ArraysMethods {

    int[] mergeArray(int[] a , int[] b , int n , int m){
        
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while(i >= 0 && j >= 0){

            if(a[i] > b[j]){
                a[k--] = a[i--];
            }
            else{
                a[k--] = b[j--];
            }
        }
        while(j >= 0){
            a[k--] = b[j--];
        }

        return a;
        
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

    int removedublicate(int[] array){

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


