/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

*/

package ai.leetocde;

import java.util.Stack;

public class validParenthesis {

    public boolean isValid(String s)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char z = s.charAt(i);
            if(z=='(' || z=='{' || z=='[')
            {
                st.push(z);
            }
            else {
                if(st.isEmpty())
                {
                    return false;
                }
                else if (z == ')' && st.pop() != '(')
                {
                    return false;
                }
                else if (z == '}' && st.pop() != '{')
                {
                    return false;
                }
                else if (z == ']' && st.pop() != '[')
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }
}
