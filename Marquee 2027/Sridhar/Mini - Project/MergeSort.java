 
public class MergeSort {
    /*
     * MERGE SORT - STEP-BY-STEP TRACE
     * Concept: Keep cutting the array in half until sizes are 1. Then stitch them 
     * back together in order.
     * * EXAMPLE 1: Array [38, 27, 43, 3]
     * Divide Phase:
     * - Split: [38, 27] and [43, 3]
     * - Split: [38], [27], [43], [3] (Base case reached)
     * Conquer/Merge Phase:
     * - Merge [38] & [27] -> Compare 27 < 38 -> [27, 38]
     * - Merge [43] & [3]  -> Compare 3 < 43  -> [3, 43]
     * - Merge [27, 38] & [3, 43] -> 3<27, 27<43, 38<43 -> [3, 27, 38, 43]
     * * EXAMPLE 2: Array [9, 2, 5]
     * Divide: [9, 2] and [5] -> [9], [2], [5]
     * Merge: [9] & [2] -> [2, 9]
     * Merge: [2, 9] & [5] -> Compare 2<5, 5<9 -> [2, 5, 9]
     */
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Find the middle point
            sort(arr, l, m);         // Sort first half
            sort(arr, m + 1, r);     // Sort second half
            merge(arr, l, m, r);     // Merge the sorted halves
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1]; // Temp Left Array
        int[] R = new int[n2]; // Temp Right Array

        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        // Compare elements from Left and Right, place smaller in original array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { arr[k] = L[i]; i++; } 
            else { arr[k] = R[j]; j++; }
            k++;
        }
        // Copy any remaining elements
        while (i < n1) { arr[k] = L[i]; i++; k++; }
        while (j < n2) { arr[k] = R[j]; j++; k++; }
    }
}