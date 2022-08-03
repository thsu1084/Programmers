import java.util.LinkedList;
import java.util.Queue;

/**
 * test
 */
public class queue {

    public static void main(String[] args) {
        solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
    }


    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String>queue = new LinkedList<>();


        for(int i=0;i<cities.length;i++){


            
            if(queue.contains(cities[i].toLowerCase())){

                queue.remove(cities[i].toLowerCase());

                queue.add(cities[i].toLowerCase());

                answer+=1;
            }else if(queue.size()<cacheSize){
                 queue.add(cities[i].toLowerCase());
                 answer+=5;
                
            }else{

                
                   if(cacheSize > 0) {
                    queue.remove();
                    queue.add(cities[i].toLowerCase());
                }
                answer += 5;
                
                

            }

        }


        System.out.println(answer);
        return answer;
    }
}
