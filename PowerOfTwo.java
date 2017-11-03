//Given an integer, write a function to determine if it is a power of two.

class Solution {
    public boolean isPowerOfTwo(int n) {
        //return n > 0 && Integer.bitCount(n) == 1;
        if (n <= 0)
            return false;
        while (n %2 == 0)
            n /= 2;
        return n == 1;
    }
}
