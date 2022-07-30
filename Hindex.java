import java.util.Arrays;
import java.util.Collections;

public class Hindex {

    public static void main(String[] args) {
        solution(new int[]{3, 0, 6, 1, 5});
    }

    
    public static int solution(int[] citations) {
           int answer = 0;


      
        Arrays.sort(citations);


        for(int i=0;i<citations.length;i++){
            int h = citations.length-i  ;

            int sum = 0;

            for(int j =0;j<citations.length;j++){
                if(citations[j] >= h )sum++;
            }

          //  System.out.println(sum +","+h);
            
           if(sum >= h ){
               answer = h;
               break;
           }
        }

        return answer;
    }
}
