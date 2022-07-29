import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthStyle;

/**
 * test
 */
public class rangenum {

    static ArrayList<String>list = new ArrayList<>();

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


       

        
    
       
       
        for(int i=0;i<commands.length;i++){
            int[] idx = commands[i];
          
            int[] sub = Arrays.copyOfRange(array, idx[0]-1, idx[1]);

            Arrays.sort(sub);

            //System.out.println(sub[idx[2]-1]);
            

            answer[i] = sub[idx[2]-1];
          
        }

        return answer;
    }
}
