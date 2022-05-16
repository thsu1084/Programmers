import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


class rankingsearch {
  
	static String[] target = new String[4];
	
	static HashMap<String, List<Integer>>map = new HashMap<>();

	
    public static  int[] solution(String[] info, String[] query) {
    
        int[] answer = new int[query.length];
        
        int index=0;

        for(String temp:info){
       
        target= temp.split(" ");
		combination(0,"");
        }
      

        for(String str : map.keySet())
        Collections.sort(map.get(str));
        
        String temp="";
        int count=0;
        for(String str: query){
            String[] array = str.split(" and ");
           
            for(String tmp:array)
            temp+=tmp;
       
        String[] mid = temp.split(" ");

        
    
        if( map.containsKey(mid[0]) ){
            ArrayList<Integer>list = new ArrayList<>();
            list = (ArrayList<Integer>) map.get(mid[0]);
           
            answer[index]=binarySearch(Integer.parseInt(mid[1]), list) ;
            index++;
           
        }else{
            answer[index]=0;
            index++;
        }
        
        temp="";
        }


      
      
        return answer;
    
    }


    private static int binarySearch(int score,ArrayList<Integer>list) {
	
  
        int start = 0, end = list.size() - 1;
	
        int mid=0;
 
	
        while (start <= end) {
	
            mid = (start + end) / 2;
	
          
            if (list.get(mid) < score)
	
                start = mid + 1;
	
            else
	
                end = mid - 1;
	
        }
	
 
	
        return  list.size()-start;
	
    }




	
	private static void combination(int cnt,String str) {
		
        if(cnt==4){
        if (!map.containsKey(str)) {
	
            List<Integer> list = new ArrayList<Integer>();

            map.put(str, list);

        }

        map.get(str).add(Integer.parseInt(target[4]));
        return;
        }
        
        combination(cnt+1, str+"-");
        combination(cnt+1, str+target[cnt]);

		
	}
}
