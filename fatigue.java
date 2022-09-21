import java.util.*;
/**
 * wordConversion
 */
public class fatigue {

   
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
       
       solution(80, new int[][]{{80,20},{50,40},{30,10}});

    }

    public static void perm(int[] arr, int depth, int n, int r,int[][] dungeons,int k) {
        if (depth == r) { 
            

            int count = 0;

           // System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                
                if(k >= dungeons[arr[i]][0]){
                //System.out.println(dungeons[arr[i]][0]+","+dungeons[arr[i]][1]+","+k);
                k = k - dungeons[arr[i]][1];
                count++;
                }
            }


            max = Math.max(count, max);

            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, r,dungeons,k);
            swap(arr, i, depth);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int solution(int k, int[][] dungeons) {
        int answer = -1;


        int[] arr = new int[dungeons.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


        perm(arr, 0, arr.length, arr.length,dungeons,k);

        System.out.println(max);


        return max;
    }
}
