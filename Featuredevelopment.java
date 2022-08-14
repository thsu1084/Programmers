import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * test
 */
public class Featuredevelopment {

    public static void main(String[] args) {
        solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }


    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};


        Queue<Integer>queue = new LinkedList<>();

        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<progresses.length;i++){

            float s = progresses[i];
            float p = speeds[i];


            int days = (int) Math.ceil((100-s)/p);

            queue.offer(days);


        }

      //  System.out.println(queue);


      int index = queue.poll();
      list.add(index);
       while(!queue.isEmpty()){


          if(index >= queue.peek()){

            list.add(index);
            queue.poll();

          }else if(index < queue.peek()) {

           index = queue.peek();
           list.add(queue.peek());
           queue.poll(); 
          }

       }

     //  System.out.println(list);



       HashMap<Integer,Integer>map = new HashMap<>();

       for(int i=0;i<list.size();i++){

           map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
       }

      // System.out.println(map);

       answer = new int[map.size()];

       index = 0;
       
        ArrayList<Integer>order = new ArrayList<>(map.keySet());

       Collections.sort(order);

       for(int i=0;i<order.size();i++){
           answer[i] = map.get(order.get(i));
       }



       //System.out.println(Arrays.toString(answer));

        return answer;
    }
}
