import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * test
 */
public class maxmin {

    static ArrayList<Integer>list = new ArrayList<>();

    public static void main(String[] args) {
        solution("-1 -2 -3 -4");
    }

    public static String solution(String s) {
        String answer = "";

        String[] strarr = s.split(" ");

        System.out.println(Arrays.toString(strarr));

        for(int i=0;i<strarr.length;i++){


            list.add( Integer.parseInt(strarr[i]) );


        }

       // System.out.println(list);

        Collections.sort(list);

        answer = answer + list.get(0)+" "+list.get(list.size()-1);

        return answer;
    }
}
