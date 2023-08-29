import java.util.Stack;

public class ProblemStatement11 {

    public static void revers(String input){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= input.length(); i++) {
            if(i<input.length() && input.charAt(i)!=' ')
                stack.add(input.charAt(i));
            else if(i==input.length() || input.charAt(i)==' ' && stack.size()>0)
            {
                while(!stack.empty())
                {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        revers("Let's take LeetCode contest");
    }
}
/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"*/