import java.util.Arrays;

public class Immigration {

    public static void main(String[] args) {
        solution(6, new int[]{7,10});
    }

    public static long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);
        long start = 0;
        long end = (long)times[times.length-1]*n;

        while (start <= end) {
            long mid = (start + end)/2;

            long sum = 0;

            for (int i = 0; i < times.length; i++) {
                sum+=mid/times[i];
            }

            if (sum >= n) {
                answer = mid;
                end = mid - 1;
            }else{

                start = mid + 1;
            }
        }


        return answer;
    }
}
