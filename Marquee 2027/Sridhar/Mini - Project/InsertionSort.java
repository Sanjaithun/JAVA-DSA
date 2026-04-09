 
public class InsertionSort {
    /*
     * INSERTION SORT - STEP-BY-STEP TRACE
     * Concept: Take one element (key) and insert it into the correct spot on its left.
     * * EXAMPLE 1: Standard Array [4, 3, 2, 10]
     * Step 1: Key = 3. Compare to 4. 4 is bigger, slide 4 right. 
     * Insert 3. -> [3, 4, 2, 10]
     * Step 2: Key = 2. Compare to 4 (slide right), compare to 3 (slide right).
     * Insert 2. -> [2, 3, 4, 10]
     * Step 3: Key = 10. Compare to 4. 10 is bigger, so stop. 
     * Result -> [2, 3, 4, 10] (Sorted!)
     * * EXAMPLE 2: Nearly Sorted [2, 1, 3, 4]
     * Step 1: Key = 1. Slide 2 right. Insert 1. -> [1, 2, 3, 4]
     * Step 2: Key = 3. 3 > 2. Do nothing.
     * Step 3: Key = 4. 4 > 3. Do nothing. (Very fast O(n) performance!)
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Slide elements right if they are larger than the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Drop key into the empty slot
        }
    }
}