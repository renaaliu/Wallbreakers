class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    if (allZeros(grid, r, c)) {
                        islands++;
                    }
                    
                }
            }
        }
        return islands;
    }
    
    public boolean allZeros(char[][] grid, int r, int c) {
        if (grid[r][c - 1] == 0 && grid[r][c + 1] == 0 && 
            grid[r - 1][c] == 0 && grid[r + 1][c] ==0) {
            return true;
        }
        return false;
    }
}