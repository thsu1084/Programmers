import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * test
 */
public class moreSpi {


    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

  
    public static void main(String[] args) {
        

        System.out.println( solution(new int[]{1, 2, 3, 9, 10, 12}, 7)) ;
    }


    public static int solution(int[] scoville, int K) {
        int answer = 0;

        

        for(int i=0;i<scoville.length;i++)priorityQueue.offer(scoville[i]);



        while(priorityQueue.peek()<=K){
           
             if(priorityQueue.size() == 1) return -1;
            int num1 = priorityQueue.peek();

            priorityQueue.poll();

            int num2 = priorityQueue.peek();

            priorityQueue.poll();

           


            priorityQueue.offer(num1+(num2*2));

            answer++;
            

           
            

            
        }




        return answer;
    }



}
