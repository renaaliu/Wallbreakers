class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] == 9) {
            int nines = 1;
            int indexOfLastNine = lastIndex;
            while (digits[indexOfLastNine - 1] == 9) {
                nines++;
                indexOfLastNine--;
            }
            digits[indexOfLastNine - 1]++;
            for (int i = 0; i < nines; i++) {
                digits[indexOfLastNine] = 0;
            }
        } else {
            digits[lastIndex]++;
        }
        return digits;
    }
}