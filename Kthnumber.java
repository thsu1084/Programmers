import java.util.ArrayList;
import java.util.Collections;


public class Kthnumber {

    public static void main(String[] args) {
        System.out.println( solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}) );
    }

    public static int[] solution(int[] array, int[][] commands) {
        
        ArrayList<Integer>answer = new ArrayList<>();
        ArrayList<Integer>list = new ArrayList<>();

        for(int[] temp : commands){
            list = new ArrayList<>();
            for (int i = temp[0]-1; i < temp[1]; i++) {
                  list.add(array[i]);        
            }

            Collections.sort(list);
            answer.add(list.get(temp[2]-1));
        }

     
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
