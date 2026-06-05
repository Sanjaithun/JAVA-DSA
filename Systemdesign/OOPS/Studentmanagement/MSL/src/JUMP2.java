public class JUMP2 {
    static void main() {
        int[] array = {2,3,1,1,4};
        int len = array.length;
        System.out.println(jumptwo(array,len));
    }

    static int jumptwo(int[] array,int len){
        int max_reach = len - 1;
        int maxk = 0;
        for(int i = 0;i < len;i++){
            if(max_reach >= maxk){
                return i;
            }
            maxk = Math.max(maxk , array[i]);
            if(i == len - 1){
                break;
            }
            maxk--;

        }
        return -1;
    }
}
