class Solution {
    public int titleToNumber(String s) {
       int ret = 1;
        String array[] = s.split(" ");
        for (int i = array.length; i > 0; i--) {
            char letter = s.charAt(i - 1);
            ret += ((letter - 65) + (26 * (array.length - i)));
        }
        return ret;
    }
}