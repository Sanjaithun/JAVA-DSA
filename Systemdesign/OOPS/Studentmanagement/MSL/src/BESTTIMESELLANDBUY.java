public class BESTTIMESELLANDBUY {
    static void main() {
        int[] array = {7,1,5,3,6,4,10,2,20};
        int len = array.length;
        int maxprofit = besttime(array,len);
        System.out.println(maxprofit);
    }
    static int besttime(int [] array,int len){
        int maxprofit = 0;
        int buy = array[0];
        for(int i = 1;i<len;i++){
            maxprofit = Math.max(maxprofit,array[i]-buy);
            buy = Math.min(buy,array[i]);
        }
        return maxprofit;
    }
}