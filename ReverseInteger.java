/***
Author:     Douglas, douglas.chan.utoronto@outlook.com
Date:       Oct 3, 2017
Problem:    7.Reverse Integer
Difficulty: Easy
Source:     https://leetcode.com/problems/reverse-integer/description/
Runtime: 45 ms

Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

***/
import java.util.*;
class ReverseInteger {
    public int reverse(int x) {
        try{
            if (x >=0) {
                String s = String.valueOf(x);
                StringBuilder sb = new StringBuilder(s);
                sb.reverse(); // reverse it
                String reversedStr = sb.toString();
                int reversedInt = Integer.valueOf(reversedStr);
                return ((reversedInt <= Integer.MAX_VALUE && reversedInt >= Integer.MIN_VALUE) ? reversedInt : 0 );
            }
            else{
                String s = String.valueOf(-x);
                StringBuilder sb = new StringBuilder(s);
                sb.reverse(); // reverse it
                String reversedStr = sb.toString();
                int reversedInt = -Integer.valueOf(reversedStr);
                return ((reversedInt <= Integer.MAX_VALUE && reversedInt >= Integer.MIN_VALUE) ? reversedInt : 0 );
            }        
        }
        catch(NumberFormatException e) {
            return 0;
        }
    }
}
