Bubble Sort: The Foundation of Brute Force🕵️‍♂️ The "Who": History & OriginsBubble Sort wasn't 
invented by just one person in a dramatic "aha!" moment; it evolved naturally from early 
computer logic. However, the first published description of the algorithm was by Edward Harry 
Friend in a 1956 paper titled "Sorting on electronic computer magnetic tapes". He originally called it a "sorting exchange" algorithm.The catchy name "Bubble Sort" was coined a few years later, in 1962, by Kenneth E. Iverson (a pioneering computer scientist who won the Turing Award). He named it this because of the visual way the elements move: just like carbon dioxide bubbles in a glass of soda, the largest, "heaviest" elements bubble up to the very top (end) of the array one position at a time.🧠 The "How": A Deep Dive into the ApproachImagine you are a teacher lining up students by height, but you can only look at two students at a time.The First Pass: You look at the 1st and 2nd student. If the 1st is taller, you make them swap places. Then you look at the 2nd and 3rd student. If the 2nd is taller, they swap. You do this all the way down the line.The Result of Pass 1: By the time you reach the end of the line, the absolute tallest student in the class has been repeatedly swapped until they are standing at the very back. They are exactly where they belong.The Second Pass: You go back to the front of the line and start over. But, you don't need to check the last student anymore because you know they are the tallest. You stop one student short.The Optimization (Early Exit): What if you walk down the line, comparing adjacent students, and you don't have to make a single swap? That means everyone is already in order! The algorithm is smart enough to realize this and immediately stops, saving time.⏱️ The Harsh Reality of $O(N^2)$ Execution TimeBubble Sort is a "Quadratic" algorithm ($O(N^2)$). This means if you multiply the amount of data by 10, the time it takes to sort multiplies by 100.Here is roughly how long a modern processor (doing 100 million operations per second) takes to run Bubble Sort. Notice how quickly it becomes a disaster:Number of Elements (N)Total Comparisons (N2)Approximate Execution TimeReal-World Verdict1,0001,000,000~0.01 secondsInstant. Feels super fast!10,000100,000,000~0.5 to 1 secondNoticeable delay, but acceptable.100,00010 Billion~1 to 3 minutesVery slow. Users will think the app froze.1,000,0001 Trillion~2.5 to 3 hoursCompletely unusable for production.10,000,000100 Trillion~11 to 12 daysThe server will probably crash before it finishes.💻 The Completed Java ImplementationHere is the exact code, heavily commented so you can see the logic we just discussed:Javapublic class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Our optimization flag
        
        // Outer loop: We need to do a full pass for every element in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the flag at the start of each pass
            
            // Inner loop: Look at adjacent pairs. 
            // The '- i' is crucial: it ignores the elements at the end 
            // that have already "bubbled up" to their correct spots!
            for (int j = 0; j < n - i - 1; j++) {
                
                // If the left item is bigger than the right item...
                if (arr[j] > arr[j + 1]) {
                    // ...Swap them!
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // We made a swap, so the array wasn't fully sorted yet
                }
            }
            
            // OPTIMIZATION: If we did a whole pass and never swapped anything,
            // the array is completely sorted. Break out of the loop early!
            if (!swapped) {
                break; 
            }
        }
    }
}