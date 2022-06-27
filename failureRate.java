import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.*;

class failureRate {
   
    
    static Map<Integer,Double>map = new HashMap<Integer,Double>();
    
    public static void main(String[] args) {
        
        solution(5,new int[] {2, 1, 2,6, 2, 4, 3, 3});
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
      

        

          for(int i=0;i<N;i++){
            double count = 0;
            double countnon = 0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]>=i+1){
                    count++; //스테이지에 도달한 플레이어에 수 
                }
                if(stages[j]==i+1){
                    countnon++;
                }
            }
    
           
            if(countnon == 0) map.put(i+1, 0.0);
            else{
            double first = countnon/count;
            map.put(i+1, first);
            }
            
           
        }
     

      
      


       

       for (int i = 0; i < N; i++) {
        double max = -1;
        int maxKey = 0;

        for (int key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxKey = key;
            }
        }

        answer[i] = maxKey ;
        map.remove(maxKey);
    }

     
       
        
        return answer;
    }
}
