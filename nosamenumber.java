import java.util.*;

/**
 * test
 */
public class nosamenumber {

    public static void main(String[] args) {
        solution(new int[]{1,1,3,3,0,1,1});
    }

    public static int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer>list = new ArrayList<>();

        int temp = arr[0];
        list.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            
             if(temp != arr[i]){
                 list.add(arr[i]);
                 temp = arr[i];
             }

        }

        

        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}
