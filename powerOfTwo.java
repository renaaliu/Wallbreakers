class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions
Memory Usage: 33.4 MB, less than 5.01% of Java online submissions
*/