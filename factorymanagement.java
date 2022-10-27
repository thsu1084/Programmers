import java.util.*;

class factorymanagement {
    public long solution(int goal, int[] durations) {
        long answer = 0;
     
        long[] dura = new long[durations.length];
        
        for(int i=0;i<durations.length;i++)dura[i] = durations[i];
        
        long max = 0;
        for(int temp: durations)max = Math.max(max,temp);
        
        long result =  binarySearch(durations,goal,max);
       
        long incentive = 0;
        long minCount = result / max;
        
        for (int d : durations) {
            incentive += result / d - minCount;
        }
        return incentive * 10_000L; 
        
        
    }
    
    public long binarySearch(final int[] durations,int goal,long max){
        long start = 0;
        long end = max*(goal/durations.length+1L);
        long answer = 0;
        while(start<end){
            long mid = (start+end)/2;
            
            int sum = 0;
            for(int temp:durations)sum+=mid/temp;
            
            if(sum<goal){
                
                start = mid + 1;
            }else{
                end =  mid ;
            }
            
        }
        
       
        return end;
    }

}
