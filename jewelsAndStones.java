class Solution {
    public int numJewelsInStones(String J, String S) {
        String[] jewelArr = J.split("");
        String[] stoneArr = S.split("");
        int jewels = 0;
        for (int i = 0; i < jewelArr.length; i++) {
            for (int j = 0; j < stoneArr.length; j++) {
               if (stoneArr[j].equals(jewelArr[i])) {
                    jewels++;
                } 
            } 
        }
        return jewels;
    }
}

/*
Runtime: 7 ms, faster than 6.14% of Java online submissions for Jewels and Stones.
Memory Usage: 36 MB, less than 90.40% of Java online submissions for Jewels and Stones.
*/