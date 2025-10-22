public class Maximum {
    int Maxi(int array[]){

        int maxi = Integer.MIN_VALUE;
        int i = 0 , j = array.length - 1;
        while (i <= j){
            if(array[i] > maxi){
                maxi = array[i];
            }
            if(array[j] > maxi){
                maxi = array[j];
            }
            i++;
            j--;
        
    }
    return maxi;
}
}