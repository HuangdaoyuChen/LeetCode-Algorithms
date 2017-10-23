/*
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
return 964176192 (represented in binary as 00111001011110000010100101000000).
*/


public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0) 
            return 0;
        
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1; // left shift 1
            if ((n & 1) == 1)  //last digit is 1
                result++;
            n >>= 1; //right shift 1
            
            
        }
        return result;
        
    }
}
