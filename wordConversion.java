import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * test
 */
class Word{
    String word;
    int depth;
    Word(String w, int d){word = w; depth = d;}
}
class wordConversion {

    public static void main(String[] args) {
        
    }
    public int solution(String begin, String taget, String[] words){
        if (!Arrays.asList(words).contains(taget)) return 0;

        Set<String>used = new HashSet<>();

        Stack<Word>stack = new Stack<>();
        

        stack.add(new Word(begin, 0));

        while (!stack.isEmpty()) {
            Word now = stack.pop();

            if (now.word.equals(taget))return now.depth;

            for(String str : words){
                if(used.contains(str))continue;
                if(!compareTo(now.word, str))continue; 
                used.add(str);
                stack.add(new Word(str, now.depth+1));
            }
        }

        return 0;
    }

    public static boolean compareTo(String now, String str){
        int index = Math.min(now.length(), str.length());

        int count = 0;
        for (int i = 0; i < index; i++) {
            if(now.charAt(i)!=str.charAt(i))count++;
        }
        
        return count == 1;
    } 
}
