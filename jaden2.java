import java.util.*;

/**
 * test
 */
public class jaden2 {

    public static void main(String[] args) {
        solution("3people unFollowed me"	);
    }


    public static String solution(String s) {
        String answer = "";

        char last =' ';

        s = s.toLowerCase();
        for (char c: s.toCharArray()) {
            if( last == ' ') c =  Character.toUpperCase(c);
            answer+=c;
            last = c;
        }

        System.out.println(answer);

        return answer;
    }
}
