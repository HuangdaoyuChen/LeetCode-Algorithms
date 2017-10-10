/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.

*/


class LengthOfLastWord{
    public int lengthOfLastWord(String s) {
        /*
        s = s.trim(); //remove white space at leading and trailing ends
        return s.length() - s.lastIndexOf(' ') -1;  
        */
        
        if (s.isEmpty())
            return 0;
       
        int tail = s.length() -1;

        // find first non-space character
        while (tail >= 0 && s.charAt(tail) == ' ' )
            tail--;
        
        
        //count length after this non-space character    
        int len = 0;
        while (tail >= 0 && s.charAt(tail) != ' ' ) {
            len++;
            tail--;
        }
       
        return len;
        
    }
}
