import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * test
 */
public class pairRemove {

    public static void main(String[] args) {
        solution("baabaa");
    }

    public static int solution(String s)
    {
        int answer = 0;

       Stack<Character>stack = new Stack<>();


       for(int i=0;i<s.length();i++){
           if(!stack.isEmpty()){
               if(stack.peek() == s.charAt(i))stack.pop();
               else{
                   stack.push(s.charAt(i));
               }
           }else{
               stack.push(s.charAt(i));
           }
       }

       if(stack.isEmpty())return 1;

        return answer;
    }


    
}
