public class REMOVEDUPLICATESFROMSORTEDARRAY {
    static void main() {
        int[] array = {0,1,2,3,3,4,5,5,8,8,9,10,10,11,11,12};
        int len = array.length;
        int uplen = removedup(array , len);
        for(int i = 0;i<uplen;i++){
            System.out.print(array[i] + " ");
        }
    }
    static int removedup(int [] array , int len){
        int i = 1;
        int j = 1;

        while(j < len){
            if(array[i-1] != array[j]){
                array[i] = array[j];
                i++;
                j++;
                continue;
            }
            j++;

        }
        return i;
    }
}
