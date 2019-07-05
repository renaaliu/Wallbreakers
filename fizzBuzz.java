class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ret = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    ret.add("FizzBuzz");
                } else {
                    ret.add("Fizz");
                }
            } else if (i % 5 == 0) {
                if (i % 3 == 0) {
                    ret.add("FizzBuzz");
                } else {
                    ret.add("Buzz");
                }
            } else {
                ret.add(Integer.toString(i));
            }
        }
        return ret;
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions
Memory Usage: 37.3 MB, less than 99.97% of Java online submissions 
*/