import java.util.*;

class overtimeindex {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder() );
        
        for(int temp: works)pq.offer(temp);
        
        int max = 0;
        for(int i=0;i<n;i++){
            max = pq.poll();
            pq.add(--max);    
        }
        int num = 0;
        while(!pq.isEmpty()){
            num = pq.poll();
            if(num>0){
                answer+=Math.pow(num,2);
            }
        }
        
        return answer;
    }
}
