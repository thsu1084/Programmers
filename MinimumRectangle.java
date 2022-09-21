import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MinimumRectangle  {

   
    public static void main(String[] args) {
        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        
        ArrayList<Integer>width = new ArrayList<>();
        ArrayList<Integer>vertical= new ArrayList<>();

        for(int[] faces : sizes){
           width.add(Math.max(faces[0], faces[1]));
        }

        

        Collections.sort(width,Collections.reverseOrder());

   


        for(int[] faces : sizes){
            vertical.add(Math.min(faces[0], faces[1]));
         }

        Collections.sort(vertical,Collections.reverseOrder());

   
        
        return answer = width.get(0)*vertical.get(0);
    }

   
}
