import java.util.Arrays;

public class stockprice{

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 2, 3});
    }

    public static int[] solution(int[] prices) {
        int[] answer = {};

        answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i+1; j < prices.length; j++) {
                count++;
                if(prices[i]>prices[j])break;
               
                
            }

            answer[i] = count;
        }

       

        return answer;
    }
}
