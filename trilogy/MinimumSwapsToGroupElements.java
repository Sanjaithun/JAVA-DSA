import java.util.Arrays;

public class MinimumSwapsToGroupElements {

    public static void main(String[] args) {
        MinimumSwapsToGroupElements solver = new MinimumSwapsToGroupElements();

        // Test Case 1
        int[] A1 = {2, 1, 4, 3};
        System.out.println("Test Case 1 Input:  " + Arrays.toString(A1));
        long[] result1 = solver.solution(A1);
        System.out.println("Test Case 1 Output: " + Arrays.toString(result1));
        System.out.println("-------------------------------------------------");

        // Test Case 2
        int[] A2 = {4, 1, 3, 2, 5};
        System.out.println("Test Case 2 Input:  " + Arrays.toString(A2));
        long[] result2 = solver.solution(A2);
        System.out.println("Test Case 2 Output: " + Arrays.toString(result2));
    }

    // --- Core Logic ---

    long[] sum_tree;
    int[] cnt_tree;
    int n;

    // Fenwick tree to keep track of the count of active positions
    void add_cnt(int i, int delta) {
        while (i <= n) {
            cnt_tree[i] += delta;
            i += i & -i;
        }
    }

    int query_cnt(int i) {
        int sum = 0;
        while (i > 0) {
            sum += cnt_tree[i];
            i -= i & -i;
        }
        return sum;
    }

    // Fenwick tree to keep track of the sum of active positions
    void add_sum(int i, long delta) {
        while (i <= n) {
            sum_tree[i] += delta;
            i += i & -i;
        }
    }

    long query_sum(int i) {
        long sum = 0;
        while (i > 0) {
            sum += sum_tree[i];
            i -= i & -i;
        }
        return sum;
    }

    // Binary lifting to find the k-th active position (the median)
    int find_kth(int k) {
        int idx = 0;
        for (int i = 20; i >= 0; i--) {
            int next_idx = idx + (1 << i);
            if (next_idx <= n && cnt_tree[next_idx] < k) {
                idx = next_idx;
                k -= cnt_tree[next_idx];
            }
        }
        return idx + 1;
    }

    public long[] solution(int[] A) {
        n = A.length;
        
        // Re-initialize arrays for every call to ensure isolated test cases
        cnt_tree = new int[n + 1];
        sum_tree = new long[n + 1];

        // Store 1-based index positions of each value
        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[A[i]] = i + 1;
        }

        long[] B = new long[n];
        long inv = 0;

        for (int i = 1; i <= n; i++) {
            int p = pos[i];

            // 1. Update Inversions
            int smaller_pos_count = query_cnt(p);
            inv += (i - 1 - smaller_pos_count);

            // Activate the current position in our trees
            add_cnt(p, 1);
            add_sum(p, p);

            // 2. Calculate Grouping Cost around the median
            long group_cost = 0;
            long total_sum = query_sum(n);

            if (i % 2 == 1) {
                int k = (i - 1) / 2;
                int m = k + 1; // Median index
                int M = find_kth(m); // Position of the median
                
                long L_raw = query_sum(M);
                long R_raw = total_sum - L_raw;
                
                group_cost = R_raw - (L_raw - M) - (long)k * (k + 1);
            } else {
                int m = i / 2; // Left-median index
                int M = find_kth(m); // Position of the left-median
                
                long L_raw = query_sum(M);
                long R_raw = total_sum - L_raw;
                
                group_cost = R_raw - L_raw - (long)m * m;
            }

            // Total swaps = internal inversions + cost to group together
            B[i - 1] = inv + group_cost;
        }

        return B;
    }
}