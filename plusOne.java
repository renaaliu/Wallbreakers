// class Solution {
//     public int[] plusOne(int[] digits) {
//         int lastIndex = digits.length - 1;
//         if (digits[lastIndex] == 9) {
//             int nines = 1;
//             int indexOfLastNine = lastIndex;
//             while (digits[indexOfLastNine - 1] == 9) {
//                 nines++;
//                 indexOfLastNine--;
//             }
//             digits[indexOfLastNine - 1]++;
//             for (int i = 0; i < nines; i++) {
//                 digits[indexOfLastNine] = 0;
//             }
//         } else {
//             digits[lastIndex]++;
//         }
//         return digits;
//     }
// }

// class Solution {
//     public int[] plusOne(int[] digits) {
//         int size = digits.length;
//         int ret[] = digits;
//         // base case 1
//         if (size == 1) {
//             if (ret[0] == 9) {
//                 size++;
//                 int newret[] = new int[size];
//                 newret[0] = 1;
//                 for (int z = 1; z < size; z++) {
//                         newret[z] = 0;
//                 }
//                 ret = newret;
//             } else {
//                 ret[0]++;
//             }
//             return ret;
//         }
//         if (ret[size - 1] == 9) {
//             if (size - 2 == 9) {
//                 // base case 2: 99
//                 if (size == 2) {
//                     size++;
//                     int newret[] = new int[size];
//                     newret[0] = 1;
//                     for (int z = 1; z < size; z++) {
//                         newret[z] = 0;
//                     }
//                     ret = newret;
//                 } else {
//                     int nonNine = size - 3;
//                     while (nonNine >= 0 && ret[nonNine] == 9) {
//                         nonNine--;
//                     }
//                     if (nonNine == 0) {
//                         // need array one larger
//                         size++;
//                         int newret[] = new int[size];
//                         newret[0] = 1;
//                         for (int z = 1; z < size; z++) {
//                             newret[z] = 0;
//                         }
//                         ret = newret;
//                     } else {
//                         // no need to increment array size
//                         ret[nonNine]++;
//                         for (int b = nonNine + 1; b < size; b++) {
//                             ret[b] = 0;
//                         }
//                     }
//                 }
//             } else {
//                 ret[size - 1] = 0;
//                 ret[size - 2]++;
//             }
//         } else {
//             ret[size - 1]++;
//         }
//         return ret;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        int size = digits.length;
        int ret[] = digits;
        if (ret[last] == 9) {
            if (size == 1) {
                int newRet[] = new int[2];
                newRet[0] = 1;
                newRet[1] = 0;
                ret = newRet;
            } else {
                int nonNine = last - 1;
                while (nonNine > 0 && ret[nonNine - 1] == 9) {
                    nonNine--;
                }
                if (nonNine == 0 && nonNine == 9) {
                    size++;
                    int newRet[] = new int[size];
                    newRet[0] = 1;
                    for (int i = 1; i < size; i++) {
                        newRet[i] = 0;
                    }
                    ret = newRet;
                } else {
                    ret[nonNine]++;
                    for (int j = nonNine; j < size; j++) {
                        ret[j] = 0;
                    }
                }
            }
        } else {
            ret[last]++;
        }
        return ret;
    }
}