class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] ret = new int[A.length][A[0].length];
        for(int r = 0; r < A.length; r++) {
            int v = 0;
            for(int c = A[0].length-1; c > -1; c--) {
                ret[r][v] = A[r][c]; 
                v++;
            }
        }
        for(int r = 0; r < ret.length; r++) {
            for(int c = 0; c < ret[0].length; c++) {
                if (ret[r][c] == 0) {
                    ret[r][c] = 1;
                } else {
                    ret[r][c] = 0;
                }   
            }
        }
        return(ret);
    }
}

/*
Runtime: 1 ms
Memory: 36.8 MB
*/