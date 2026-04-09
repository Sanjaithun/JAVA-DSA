 
public class HeapSort {
    /*
     * HEAP SORT - STEP-BY-STEP TRACE
     * Concept: Treat array as a tree. Make parent nodes bigger than children (Max Heap).
     * Swap the biggest node (root) to the end, shrink tree, repeat.
     * * EXAMPLE 1: Array [4, 10, 3]
     * Step 1: Build Max Heap. 
     * Tree: 4 is root. Children are 10 (left), 3 (right).
     * 10 > 4, so swap them. Array becomes [10, 4, 3]. Root is now biggest.
     * Step 2: Extract Max.
     * Swap Root (10) with Last element (3). -> [3, 4 | 10] (10 is sorted!)
     * Step 3: Heapify remaining [3, 4].
     * Tree: 3 is root. Child is 4. Swap -> [4, 3 | 10].
     * Step 4: Extract Max.
     * Swap Root (4) with Last (3). -> [3 | 4, 10] (Sorted!)
     * * EXAMPLE 2: Array [1, 5, 2]
     * Step 1: Heapify -> [5, 1, 2] (5 is biggest)
     * Step 2: Swap 5 to end -> [2, 1 | 5]
     * Step 3: Heapify [2, 1] -> Already fine. Swap 2 to end -> [1 | 2, 5]
     */
    public static void sort(int[] arr) {
        int n = arr.length;

        // Build max heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;     // Initialize largest as root
        int l = 2 * i + 1;   // left child
        int r = 2 * i + 2;   // right child

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) largest = r;

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}