import java.util.ArrayList;
import java.util.Arrays;

/**
 * wordConversion
 */
public class carpet {


    static ArrayList<Integer>list = new ArrayList<>();

    static ArrayList<ArrayList<Integer>>pair = new ArrayList<>();
    public static void main(String[] args) {
    
        System.out.println(Arrays.toString(solution(18, 6) ) );
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {0,0} ;


        isPrime(brown + yellow);

        


        for (int i = 0; i < pair.size(); i++) {
            ArrayList<Integer>tmp = pair.get(i);

           
            if (tmp.get(0) >= 3 && tmp.get(1) >=3 && tmp.get(0) >= tmp.get(1)) {
                if((tmp.get(0)-2)*(tmp.get(1)-2) == yellow){
                   return tmp.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        

       
        return answer;
    }

    public static void isPrime(int n) {
        for (int i = 1; i<=n; i++) {
          if (n % i == 0) {
              list.add(i);
              list.add(n/i);
              pair.add(list);
              list = new ArrayList<>();
          }
        }
      
    }
}
