public class MAJORITYELEMENT {
    static void main() {
        //bore's algorithm && half more major elements
        int[] array = {2,2,3,3,2,2,2,2,3,2,4,5,5,5,2,5,5,2,2};
        int len = array.length;
        int element = majority(array, len);
        System.out.println(element + " " + len);
     }
     static int majority(int [] array , int len){
        int element = 0;
        int freq = 0;
        for(int i : array){
            if(freq == 0){
                element = i;
            }

            if(i == element) freq++;
            else freq--;
        }
        return element;
     }
}
