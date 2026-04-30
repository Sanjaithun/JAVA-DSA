public class BESTTIMESELLANDBUYTWO {
    static void main() {
        int[] array = {7,1,5,3,6,4};
        int len = array.length;
        int maxprofit = besttime(array,len);
        System.out.println(maxprofit);
    }
    static int besttime(int [] array,int len){
        int maxprofit = 0;
        for(int i = 1;i<len;i++){
            if(array[i] > array[i-1]){
                maxprofit = maxprofit + (array[i] - array[i-1]);
            }
        }
        return maxprofit;
    }
}
