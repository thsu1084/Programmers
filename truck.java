import java.util.*;


public class truck {

    public static void main(String[] args) {
        solution(2, 10, new int[]{7,4,5,6});
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;   

        Queue<Integer>bridge = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
           int truck = truck_weights[i];

           while (true) {
               if(bridge.isEmpty()){
                  bridge.offer(truck);
                  sum+=truck;
                  answer++;
                  break;
               }else if(bridge.size()<bridge_length){

                  sum+=truck;
                  
                  if (sum <= weight) {
                      bridge.offer(truck);
                      answer++;
                      break;
                  }else{
                      bridge.offer(0);
                      sum-=truck;
                      answer++;
                      continue;
                  }

                 
               }else if (bridge.size() == bridge_length) {
                  sum-= bridge.poll();
                  
                }
                
           }
         
        }


       
        return answer+bridge_length;
    }
}
