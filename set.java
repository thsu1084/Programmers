import java.util.*;

class set {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        int share = s/n;
        int remainder = s%n;
        if(share == 0)return new int[]{-1};
        for(int i=0;i<n;i++){
            answer[i] = share;
        }
        int index = answer.length-1;
        for(int i=0;i<remainder;i++){
            answer[index]++;
            index--;
        }
        
        
        
        return answer;
    }
}
