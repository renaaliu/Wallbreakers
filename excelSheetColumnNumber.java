import java.lang.Math;

class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(s.length() - 1 - i);
            ret += (Math.pow(26, i) * (letter - 64));
        }
        return ret;
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
*/