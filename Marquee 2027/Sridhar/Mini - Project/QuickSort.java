 
public class QuickSort {
    /*
     * QUICK SORT - STEP-BY-STEP TRACE
     * Concept: Pick a pivot. Smaller numbers go left, bigger numbers go right. Repeat.
     * * EXAMPLE 1: Array [10, 80, 30, 90, 40]
     * Initial Call: Pivot is 40. 
     * - Scan from left: 10 < 40 (Swap with itself).
     * - Scan: 80 > 40 (Ignore).
     * - Scan: 30 < 40 (Swap 30 with 80) -> [10, 30, 80, 90, 40]
     * - Scan: 90 > 40 (Ignore).
     * - End of scan. Swap Pivot (40) with 80 -> [10, 30, 40, 90, 80]
     * Pivot 40 is now in its permanent exact spot. 
     * Left side [10, 30] and Right side [90, 80] are recursively sorted.
     * * EXAMPLE 2: Array [5, 1, 4, 2]
     * Initial Call: Pivot is 2.
     * - 5 > 2 (Ignore), 1 < 2 (Swap 1 & 5) -> [1, 5, 4, 2]
     * - 4 > 2 (Ignore). 
     * - End of scan. Swap Pivot (2) with 5 -> [1, 2, 4, 5]
     * 2 is locked. Right side [4, 5] recursively sorted.
     */
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // pi is partitioning index
            sort(arr, low, pi - 1);  // Recursively sort left
            sort(arr, pi + 1, high); // Recursively sort right
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = (low - 1);     // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}