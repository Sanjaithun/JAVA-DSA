public class REMOVEELEMENT {
    static void main() {
        int[] array = {0,1,2,2,3,0,4,2};
        int val = 2;
        int uplen = removeelementhelper(array , val);
        for(int i = 0;i<uplen;i++){
            System.out.print(array[i]+" ");
        }
    }
    static int removeelementhelper(int[] array , int val){
        int len = array.length - 1;
        int i = 0;
        int j = len;
        int temp;
        while(i<=j){
            if(array[i] != val){
                i++;
                continue;
            }
            while(array[j] == val){
                j--;
            }
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return i;
    }
}
