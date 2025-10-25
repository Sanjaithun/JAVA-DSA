public class maxi {
    int maximum(int[] array){
      int val = Integer.MIN_VALUE;
      for(int i = 0; i < array.length;i++){
        if(val < array[i]){
            val = array[i];
        }
      }  
      return val;
    }
}
