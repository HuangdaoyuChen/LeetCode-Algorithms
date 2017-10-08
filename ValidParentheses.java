/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/


class ValidParentheses {
    public boolean isValid(String s) {
        //string length is odd and characters not in pairs
        if(s.length() %2 != 0) 
            return false;
        
        char[] chars = s.toCharArray();
        Map<Character,Character> pairs = new HashMap<Character,Character>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']');

        Stack<Character> stack = new Stack<Character>();
        for (char c:chars) {
            if (pairs.containsKey(c)) {
                stack.push(pairs.get(c));
            } else {
                if (stack.isEmpty() || c != stack.pop()) 
                    return false;
            }
        }
        return stack.isEmpty();
    }
        
    
}
