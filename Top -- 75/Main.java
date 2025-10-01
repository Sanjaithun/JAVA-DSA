
public class Main {
    public static void main(String[] args) {
        
        ProductArray obj = new ProductArray();
        int[] Array = {1,2,3,4,5};
        int[] product = obj.checkProductArray(Array, Array.length);
        for(int i = 0;i < Array.length;i++){
            System.out.print(product[i] + " ");
        }
        }
    }

