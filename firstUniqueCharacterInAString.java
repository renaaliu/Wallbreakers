class Solution {
    public int firstUniqChar(String s) {
        int ret = -1;
        for (int i = 0; i < s.length(); i++) {
             String rep = s.substring(i);
            String rest = s.substring(i+1, s.length());
            if (!(rest).contains(rep)) {
                return(i);
            }
        }
        return(ret);
    }
}