import java.lang.ProcessHandle.Info;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



class archery_competition  {
    
  
    static boolean[] visit;
    static int count;
    static  int[] result={-1};
    static int max=0;





    public static int[] solution(int n, int[] info) {


       

        int[] chosen = new int[11];
        
       visit = new boolean[11];
        Arrays.fill(visit, true);
  
       

        
        
    
        
        for(int i=0;i<11;i++){
            chosen= new int[11];
           
            count=0;
            for(int j=0;j<=10;j++){
            if(solve(chosen, j,info,n)==n)break;
      
            }
    
           int lion=0;
           int apeach=0;
           for(int j=0;j<11;j++){
             
                  
                  if(chosen[j]==0&&info[j]==0)continue;
                  if(chosen[j]<=info[j])apeach+=10-j;
                   else lion+=10-j;
                   
                   
               
           }

           
           
           if(lion > apeach) {
          
             if((lion-apeach)>max){
               max=lion-apeach;
               result=chosen.clone();
             }else if((lion-apeach)==max)
                  for(int w=10; w>=0; w--) {
                if(chosen[w] > result[w]) {
                  result=chosen.clone();
                  break;
                 }
                 else if(chosen[w] < result[w])break;
                 
                  }  
                
           }

          
           
            Arrays.fill(visit, true);
            visit[i]=false;
            count=0;
            
        }


     


    
        return result;

    }


    private static int solve(int[] chosen, int curr,int[] info,int n){
    
       
        while(chosen[curr]<=info[curr]&&visit[curr]==true&&count<n){
            chosen[curr]++;
            count++;
          
        }
      
      
     
     
       
        if(count==n){
            if(chosen[curr]<=info[curr]){
                if(curr<10){
                     count=count-chosen[curr];
                     chosen[curr]=0;
                }
                
            }
        }
        return count;
    }
    
   
    
    
}
