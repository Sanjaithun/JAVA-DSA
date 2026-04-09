 
public class SelectionSort {
    /*
     * SELECTION SORT - STEP-BY-STEP TRACE
     * Concept: Find the absolute smallest item in the unsorted part, swap it to the front.
     * * EXAMPLE 1: Standard Array [29, 10, 14, 37]
     * Step 1: Unsorted [29, 10, 14, 37] -> Smallest is 10. 
     * Swap 10 and 29. 
     * Result: [10 | 29, 14, 37] (| marks sorted boundary)
     * Step 2: Unsorted [29, 14, 37] -> Smallest is 14. 
     * Swap 14 and 29. 
     * Result: [10, 14 | 29, 37]
     * Step 3: Unsorted [29, 37] -> Smallest is 29. 
     * Swap 29 with itself (no change).
     * Result: [10, 14, 29, 37] (Sorted!)
     * * EXAMPLE 2: Already Sorted [1, 2, 3]
     * Step 1: Smallest is 1. Swap 1 with 1. -> [1 | 2, 3]
     * Step 2: Smallest is 2. Swap 2 with 2. -> [1, 2 | 3] (Still scans, taking O(n^2) time)
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // Assume current index is smallest
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // Found a new smallest
                }
            }
            // Swap smallest found with the front of unsorted part
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}