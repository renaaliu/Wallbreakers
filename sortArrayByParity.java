class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] sorted = new int[len];
        int j = 0;
        for (int i = 0 ; i < len; i++) {
            if (A[i] % 2 == 0) {
                sorted[j] = A[i];
                A[i] = -1;
                j++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (A[i] != -1) {
                sorted[j] = A[i];
                j++;
            }
        }
        return(sorted);
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 39.8 MB, less than 95.03% of Java online submissions for Sort Array By Parity.
*/