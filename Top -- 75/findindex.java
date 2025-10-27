public class findindex {
    
    int findvalue(int[] array, int target){

        for(int i = 0;i<array.length;i++){

            if(array[i] == target){
                return i;
            }
            else if(array[i] > target){
                return i - 1;
            }

        }
        return array.length + 1;

    }

}

// do this in the binary search
