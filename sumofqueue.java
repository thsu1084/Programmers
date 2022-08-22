import java.util.LinkedList;
import java.util.Queue;

/**
 * test
 */
public class sumofqueue {

    public static void main(String[] args) {
        solution(new int[]{1,1}, new int[]{1,5});
    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        long sum1 = 0;
        long sum2 = 0;

        Queue<Long>q1 = new LinkedList<>();

        Queue<Long>q2 = new LinkedList<>();

        for(int i=0;i<queue1.length;i++){
            q1.offer((long)queue1[i]);
            q2.offer((long)queue2[i]);
       
            sum1+=queue1[i];
            sum2+=queue2[i];
        }

        if((sum1+sum2)%2 != 0)return -1;
       
        while (sum1 != sum2) {
            

            if(answer >= queue1.length*10)return -1;

            if(sum1 < sum2){
                q1.offer(q2.peek());
                sum1+=q2.peek();
                sum2-=q2.poll();
                answer++;
            }else if(sum1 > sum2){
                q2.offer(q1.peek());
                sum1-=q1.peek();
                sum2+=q1.poll();
                answer++;
            }

            

        }

        return answer;
    }
}
