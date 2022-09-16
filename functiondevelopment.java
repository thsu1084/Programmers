import java.util.ArrayList;
import java.util.Arrays;


public class functiondevelopment{

    public static void main(String[] args) {
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int[] num = new int[progresses.length];

        ArrayList<Integer>tmp = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            num[i] = (100 - progresses[i])/speeds[i] ;
            if ((100-progresses[i])%speeds[i] != 0) {
                num[i]++;
            }
        }

        

        int temp = num[0];
        int count = 1;
        for (int i = 1; i < num.length; i++) {
            if(temp >= num[i])count++;
            else{
                tmp.add(count);
                temp = num[i];
                count = 1;
            }
        }

        tmp.add(count);
      

         answer = new int[tmp.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }
        
        return answer;
    }
}
