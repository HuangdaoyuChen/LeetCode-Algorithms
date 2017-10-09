/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) 
            return 0;
        if (haystack.isEmpty())
            return -1;
        
        int l1 = haystack.length();
        int l2 = needle.length();
        int i =0;
        while(i <= l1-l2) {
           if (haystack.substring(i,i+l2).equals(needle))
               return i;
            i++;
        }
        return -1;
        
    }
}
