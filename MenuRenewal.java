import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * MenuRenewal
 */
public class MenuRenewal {

    static char[] target ;
	// 대상 숫자를 담아둘 배열.
	static char[] result ;


    static HashMap<String,Integer>map = new HashMap<>();


    static ArrayList<String>list = new ArrayList<>();

	public static void main(String[] args) {
		String[] orders ={"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,5};
        solution(orders,course);
	}


    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        

       
        for(int i=0;i<orders.length;i++){
            char[] ch = orders[i].toCharArray();
            target = new char[ch.length];
            target = ch.clone();

       
            for(int j=0;j<course.length;j++){   
              
                if(course[j]<=orders[i].length()){
                result = new char[course[j]];
                combination(0, 0);
                }
            }
        }
       

       // System.out.println(map);
       


        
        for(int i=0;i<course.length;i++){


            int max = 2;
            for(String key: map.keySet()){
                if(key.length()==course[i]){
                    if(map.get(key)>max)max=map.get(key);
                }
            }

            for(String key : map.keySet()){
                if(key.length()==course[i]){
                    if(map.get(key)==max){
                       list.add(key);
                    }
                }
            }


        }

      
     //   System.out.println(list);

        Collections.sort(list);

        answer = new String[list.size()];


        for(int i=0;i<list.size();i++)answer[i] = list.get(i);

     //   System.out.println(Arrays.toString(answer));

        return answer;
    }




	
	private static void combination(int cnt, int idx) {
		
		if (cnt == result.length) {
		
           // System.out.println(Arrays.toString(result));


            String str = "";
            for(int i=0;i<result.length;i++)str+=result[i];

            char[] chars = str.toCharArray();


            Arrays.sort(chars);

            str = new String(chars);

            if(!map.containsKey(str)){
                map.put(str, 1);
            }
            else {
                map.put(str, map.get(str)+1);
            }
           

           
            

			return;
		}
	
		for (int i = idx; i < target.length; i++) {
			
			result[cnt] = target[i];
			
			combination(cnt + 1, i + 1);
		}
	}
}
