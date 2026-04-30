public class REMOVEDUPLICATESOFMORETHENTWO {
    static void main() {
        int[] array = {0,0,1,1,1,1,2,3,3,3,4};
        int len = array.length;
        int uplen = removeduptwo(array , len);
        for(int i = 0;i<uplen;i++){
            System.out.print(array[i] + " ");
        }
    }
    static int removeduptwo(int [] array , int len){
        int i = 2;

        for(int j = 2;j<len;j++){
            if(array[j] != array[i-2]){
                array[i] = array[j];
                i++;
            }
        }
        return i;
    }
}
