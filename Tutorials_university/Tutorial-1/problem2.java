/**
 * Problem 2: Array Operations (Recursive Implementation)
 * 
 * Description:
 * 1. Write the method `reverseArray` that reverses an array of n elements 
 *    (including defining its signature).
 * 
 * 2. Write the method `isIncreasing` that checks if an array is sorted 
 *    in increasing order (including defining its signature).
 */

//1
public static void reverseArray(int[] A, int lo, int hi) {
    if (lo >= hi) {
        return;
    }
    
    int tmp = A[lo];
    A[lo] = A[hi];
    A[hi] = tmp;
    
    reverseArray(A, lo + 1, hi - 1);
}

//2
public static boolean isIncreasing(int[] A, int n) {
    if (n == 1) {
        return true;
    }
    
  return A[n - 1] >= A[n - 2] && isIncreasing(A, n - 1);
}
