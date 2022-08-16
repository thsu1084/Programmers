import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * test
 */
public class findthesmallest {

    public static void main(String[] args) {
        solution(new int[]{4,3,2,1});
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};


        if(arr.length == 1) return new int[]{-1};

        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)list.add(arr[i]);

        Collections.sort(list);

        arr = Arrays.stream(arr).filter(c -> c != list.get(0)).toArray();

       // System.out.println(Arrays.toString(arr));

        return arr;
    }
}
