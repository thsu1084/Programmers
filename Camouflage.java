import java.util.HashMap;

/**
 * wordConversion
 */
public class Camouflage {

    public static void main(String[] args) {
        solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer>map = new HashMap<>();

        for(String[] temp: clothes){
            String name = temp[0];
            String type = temp[1];

            map.put(type, map.getOrDefault(type, 0) + 1);

        }

      

        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }

        return answer-1;
    }
}
