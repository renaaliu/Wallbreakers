class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            int len = s.length;
            char temp = char[len - i];
            char[s.length - i] = char[i];
            char[i] = temp;
        }
        return s;
    }
}

