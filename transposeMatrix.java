class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] ret = new int[col][row];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                ret[c][r]=A[r][c];
            }
        }
        return(ret);
    }
}

/*
Runtime: 0 ms
Memory: 39 MB
*/