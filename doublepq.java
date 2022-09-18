import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * 
   I 숫자	큐에 주어진 숫자를 삽입합니다.
   D 1	큐에서 최댓값을 삭제합니다.
   D -1	큐에서 최솟값을 삭제합니다.
 */
public class  doublepq{

    public static void main(String[] args) {
        solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"});
    }

    public static int[] solution(String[] operations) {
        int[] answer = {};


        ArrayList<Integer>list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            String[] strarr = operations[i].split(" ");

            //System.out.println(Arrays.toString(strarr));

            if(strarr[0].equals("I")){
                list.add(Integer.parseInt(strarr[1]));
            }else if(strarr[0].equals("D")&&strarr[1].equals("1")&&!list.isEmpty()){
                Collections.sort(list,Collections.reverseOrder());
                
                list.remove(0);
            }else if(strarr[0].equals("D")&&strarr[1].equals("-1")&&!list.isEmpty()){
                Collections.sort(list);
                
                list.remove(0);
            }

        }
        

        if(list.isEmpty()){
            list.add(0);
            list.add(0);
        }else if (list.size() == 2) {
            Collections.sort(list,Collections.reverseOrder());
        }else if(list.size() > 2){
            answer = new int[2];
            Collections.sort(list);
            answer[1] = list.get(0);
            Collections.sort(list,Collections.reverseOrder());
            answer[0] = list.get(0);
            return answer;
        }

        //System.out.println(list);
        //System.out.println(Arrays.toString(answer));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
