import java.util.ArrayList;

// class Solution {
//     public int findCircleNum(int[][] M) {
//         int circles = 0;
//         ArrayList<Integer> group = new ArrayList<Integer>();
//         for (int r = 0; r < M.length; r++) {
//             for (int c = 0; c < M[0].length; c++) {
//                 if (M[r][c] == 1 && M[c][r] == 1 
//                     && group.size() == 0) {
//                     group.add(c);
//                     group.add(r);
//                     circles++;
//                 }
//                 if (M[r][c] == 1 && M[c][r] == 1) {
//                     if (!group.contains(c) && !group.contains(r))
//                     {
//                         circles++;
//                     }
//                     group.add(c);
//                     group.add(r);
//                 }
//             }
//         }
//         return circles;
//     }
// }

class Solution {
    public int findCircleNum(int[][] M) {
        int friends = 0;
        int[] done = new int[0];
        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[0].length; c++) {
                if (M[r][c] == 1 && M[c][r] == 1 && r != c && done[r] == 0 && done[c] == 0) {
                    for (int i = 0; i < M[0].length - r; i++) {
                        if (M[c][r + i] == 1 && M[i][c] == 1 && r + i != c) {
                            done[r + i] = 1;
                            friends++;
                        }
                    }
                }
            }
        }
        return friends;
    }
}
