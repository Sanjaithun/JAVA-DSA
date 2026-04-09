import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array length: ");
        int n = scanner.nextInt();
        
        int[] data = Helper.generateRandom(n);
        long start;

        System.out.println("\nOriginal Array: " + formatArray(data));
        System.out.println("----------------------------------------------------------------------");

        // 1. Bubble Sort
        int[] a1 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        BubbleSort.sort(a1);
        long t1 = System.currentTimeMillis() - start;
        System.out.println("Bubble Sorted:    " + formatArray(a1));

        // 2. Selection Sort
        int[] a2 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        SelectionSort.sort(a2);
        long t2 = System.currentTimeMillis() - start;
        System.out.println("Selection Sorted: " + formatArray(a2));

        // 3. Insertion Sort
        int[] a3 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        InsertionSort.sort(a3);
        long t3 = System.currentTimeMillis() - start;
        System.out.println("Insertion Sorted: " + formatArray(a3));

        // 4. Quick Sort
        int[] a4 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        QuickSort.sort(a4, 0, n - 1);
        long t4 = System.currentTimeMillis() - start;
        System.out.println("Quick Sorted:     " + formatArray(a4));

        // 5. Merge Sort
        int[] a5 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        MergeSort.sort(a5, 0, n - 1);
        long t5 = System.currentTimeMillis() - start;
        System.out.println("Merge Sorted:     " + formatArray(a5));

        // 6. Heap Sort
        int[] a6 = Helper.duplicate(data);
        start = System.currentTimeMillis();
        HeapSort.sort(a6);
        long t6 = System.currentTimeMillis() - start;
        System.out.println("Heap Sorted:      " + formatArray(a6));

        // --- PRINT DEEP DIVE ALGORITHM TABLE ---
        printAlgorithmTable();

        // --- FINAL COMPARISON REPORT ---
        System.out.println("\n==========================================================================================");
        System.out.println("                          FINAL PERFORMANCE REPORT (" + n + " elements)");
        System.out.println("==========================================================================================");
        System.out.println("1. Bubble Sort:    " + t1 + " ms");
        System.out.println("2. Selection Sort: " + t2 + " ms");
        System.out.println("3. Insertion Sort: " + t3 + " ms");
        System.out.println("4. Quick Sort:     " + t4 + " ms");
        System.out.println("5. Merge Sort:     " + t5 + " ms");
        System.out.println("6. Heap Sort:      " + t6 + " ms");
        System.out.println("==========================================================================================");
    }

    /**
     * Smart Array Formatter:
     * If length <= 25, returns the exact array.
     * If length > 25, returns the first 25 elements with a "..." at the end.
     */
    private static String formatArray(int[] arr) {
        if (arr.length <= 25) {
            return Arrays.toString(arr);
        } else {
            int[] truncated = Arrays.copyOfRange(arr, 0, 25);
            String str = Arrays.toString(truncated);
            return str.substring(0, str.length() - 1) + ", ... ] (" + (arr.length - 25) + " more items)";
        }
    }

    /**
     * Prints a clean, easy-to-read comparison table of the algorithms.
     */
    private static void printAlgorithmTable() {
        System.out.println("\n\n===============================================================================================================");
        System.out.println("                                       ALGORITHM TECHNICAL COMPARISON TABLE");
        System.out.println("===============================================================================================================");
        
        String format = "| %-10s | %-10s | %-10s | %-8s | %-6s | %-50s |\n";
        
        System.out.printf(format, "ALGORITHM", "BEST TIME", "WORST TIME", "SPACE", "STABLE", "MECHANISM & BEST USE CASE");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        
        System.out.printf(format, "Bubble", "O(n)", "O(n^2)", "O(1)", "Yes", "Swaps adjacent elements. Use: Purely educational.");
        System.out.printf(format, "Selection", "O(n^2)", "O(n^2)", "O(1)", "No", "Finds minimum to swap. Use: High write-cost memory.");
        System.out.printf(format, "Insertion", "O(n)", "O(n^2)", "O(1)", "Yes", "Card-player insert. Use: Small or mostly sorted arrays.");
        System.out.printf(format, "Quick", "O(n log n)", "O(n^2)", "O(log n)", "No", "Pivot partitioning. Use: Fast, general-purpose sorting.");
        System.out.printf(format, "Merge", "O(n log n)", "O(n log n)", "O(n)", "Yes", "Divide & merge halves. Use: Object sorting, huge files.");
        System.out.printf(format, "Heap", "O(n log n)", "O(n log n)", "O(1)", "No", "Max-heap extraction. Use: Strict memory limits/Embedded.");
        
        System.out.println("===============================================================================================================");
    }
}