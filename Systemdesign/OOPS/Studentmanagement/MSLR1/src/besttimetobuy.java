
public class besttimetobuy {
    static void main() {
        int[] array = {7,1,5,3,4,10,2,20};
        int buy = array[0];
        int max = 0;
        for(int i = 1;i<array.length;i++){
            max = Math.max(max,array[i]-buy);
            buy = Math.min(buy,array[i]);
        }
        System.out.println("Maximum Profit : " + max);
    }
}
