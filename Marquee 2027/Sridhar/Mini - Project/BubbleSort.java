 
public class BubbleSort {
    /*
     * BUBBLE SORT - STEP-BY-STEP TRACE
     * Concept: Adjacent elements are compared and swapped if the left is bigger than the right.
     * * EXAMPLE 1: Standard Array [4, 2, 7, 1]
     * Pass 1:
     * - Compare 4 & 2 -> Swap -> [2, 4, 7, 1]
     * - Compare 4 & 7 -> OK   -> [2, 4, 7, 1]
     * - Compare 7 & 1 -> Swap -> [2, 4, 1, 7] (7 has bubbled to the end)
     * Pass 2:
     * - Compare 2 & 4 -> OK   -> [2, 4, 1, 7]
     * - Compare 4 & 1 -> Swap -> [2, 1, 4, 7] (4 has bubbled to its spot)
     * Pass 3:
     * - Compare 2 & 1 -> Swap -> [1, 2, 4, 7] (Sorted!)
     * * EXAMPLE 2: Worst Case (Reversed) [3, 2, 1]
     * Pass 1: [2, 3, 1] -> [2, 1, 3]
     * Pass 2: [1, 2, 3] (Sorted, but loop still finishes checking)
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}