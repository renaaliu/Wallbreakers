import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ret = new ArrayList<Integer>(); 
        for (int i = left; i <= right; i++) {
            if (selfDivides(i)) {
                ret.add(i);
            }
        }
        return(ret);
    }
    
    public boolean selfDivides(int n) {
        int i = n;
        int divisor = i % 10;
        if (n < 10) {
           return true; 
        }
        if (divisor == 0) {
            return false;
        }
        while (i > 0 && n % divisor == 0) {
            i /= 10;
            divisor = i % 10;
            if (divisor == 0) {
                return false;
            }
            if (i / divisor == 1 && n % divisor == 0) {
                return true;
            }
        }
        return false;
    }
}

/*
Runtime: 2 ms, faster than 70.57% of Java online submissions
Memory Usage: 33.7 MB, less than 34.46% of Java online submissions
*/


// Second, hopefully clearner attempt:

/*
import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right)       {
       List<Integer> ret = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int cop = i;
            int a = i % 10;
            while (a != 0 && i % a == 0) {
                if (cop >= 0) {
                    cop /= 10;
                    a = cop % 10;
                 } 
            }
            if (cop < 0) {
                ret.add(i);
            }
        }
        return ret;
    }
}
    
    // outputs blank array but not sure why
*/