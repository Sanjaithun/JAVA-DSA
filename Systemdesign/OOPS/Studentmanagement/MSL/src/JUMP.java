public class JUMP {
    static void main() {
        int[] array = {4,0,0,0,1};
        int len = array.length - 1;
        System.out.println(jumps(array,len));
    }
    static boolean jumps(int [] array ,int len){
        int maxk = 0;
        for(int i = 0 ;i < array.length;i++){
            maxk = Math.max(maxk , array[i]);

            if(i == array.length - 1){
                break;
            }
            maxk--;
            if(maxk == -1){
                return false;
            }
        }
        if(maxk < 0)
            return false;
        else
            return true;

    }
}
