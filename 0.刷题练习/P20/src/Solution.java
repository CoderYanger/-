import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 王洋
 * Date: 2025-08-08
 * Time: 01:16
 */
class Solution {

    //20. 有效的括号
    /*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    每个右括号都有一个对应的相同类型的左括号。
    示例 1：
    输入：s = "()"
    输出：true
    示例 2：
    输入：s = "()[]{}"
    输出：true
    示例 3：
    输入：s = "(]"
    输出：false
    示例 4：
    输入：s = "([])"
    输出：true
    示例 5：
    输入：s = "([)]"
    输出：false
    提示：
            1 <= s.length <= 104
    s 仅由括号 '()[]{}' 组成*/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ch2=stack.peek();
                if(ch==')'&&ch2=='('||ch=='}'&&ch2=='{'||ch==']'&&ch2=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
