import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class  {

    static ArrayList<String>list = new ArrayList<>();

    public static void main(String[] args) {
        solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};

        String[] str = new String[n];

        for(int i=0;i<n;i++)str[i]="";



        for(int i=0;i<words.length/n;i++){
           
            for(int j=n*i;j<n*i+n;j++){
                list.add(words[j]);
            }

            for(int j=0;j<n;j++){
                str[j] = str[j] + list.get(j)+",";
            }

            list = new ArrayList<>();
        }

      
        if(words.length%n != 0){
            for(int j=words.length/n*n;j<n*(words.length/n)+words.length%n;j++){
                list.add(words[j]);
            }

            for(int j=0;j<words.length%n;j++){
                str[j] = str[j] + list.get(j)+",";
            }

            list = new ArrayList<>();
        }
      
        
        HashMap<Integer,String[]>map = new HashMap<>();


        for(int i=0;i<n;i++){

            String[] strarr = str[i].split(",");

            map.put(i, strarr);

        }
        
        
        
        

        HashMap<String, Integer> overlap = new HashMap<String, Integer>();
        for(String key : words) {
            overlap.put(key, overlap.getOrDefault(key, 0)+1);
        }
        

        String var = "";
        for(String temp : overlap.keySet()){
            if(overlap.get(temp) > 1){
                var = temp;
               // break;
            }
        }

      
        for(Integer key: map.keySet()){
            String[] arr = map.get(key);

            for(int i=0;i<arr.length;i++){
                if(arr[i].equals(var)&&key>1){
                   answer[0] = key+1;
                   answer[1] = i+1;
                 //  System.out.println(Arrays.toString(answer));
                   return answer;
                }
            }
        }
        
    
        
       
        
        

        String error = "";
        for(int i=0;i<words.length-1;i++){
            if( i>0&&words[i-1].toCharArray()[words[i-1].length()-1] != words[i].toCharArray()[0]){
                error = words[i];
                break;
            }
        }

      

        for(Integer key: map.keySet()){
            String[] arr = map.get(key);

            for(int i=0;i<arr.length;i++){
                if(arr[i].equals(error)){
                    answer[0] = key+1;
                    answer[1] = i+1;
                   // System.out.println(Arrays.toString(answer));
                    return answer;
                }
            }
        }

       
          
        return answer;
    }
}
