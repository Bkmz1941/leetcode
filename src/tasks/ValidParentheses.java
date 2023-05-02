package tasks;

import java.util.Stack;

/**
 * <h2>Task number is 20</h2>
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid
 * </p>
 * <p>An input string is valid if:</p>
 * <ul>
 *      <li>Open brackets must be closed by the same type of brackets</li>
 *      <li>Open brackets must be closed in the correct order</li>
 *      <li>Every close bracket has a corresponding open bracket of the same type</li>
 * </ul>
 * <p>Examples:</p>
 * <p>Input: s = "()" Output: true</p>
 * <p>Input: s = "()[]{}" Output: true</p>
 * <p>Input: s = "(]" Output: false</p>
 * <br>
 * <p>Constraints:</p>
 * <ul>
 *     <li>1 <= s.length <= 10^4</li>
 *     <li>s consists of parentheses only '()[]{}'</li>
 * </ul>
 */
public class ValidParentheses {
    public static void main(String[] args) {
        assert isValid("{[]}") : "Failure: ()";
        assert isValid("()") : "Failure: ()";
        assert isValid("()[]{}") : "Failure: ()[]{}";
        assert !isValid("(]") : "Failure: (]";
        assert !isValid("([}}])") : "Failure: ([}}])";

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c: s.toCharArray()) {
           if (c == '(') {
                stack.push(')');
           } else if (c == '{') {
               stack.push('}');
           } else if (c == '[') {
               stack.push(']');
           } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
           }
        }
        return stack.isEmpty();
    }
}
