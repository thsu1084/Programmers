
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class listofnumber {


    static ArrayList<String>list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println( solution(new String[]{"119", "97674223", "1195524421"}) ) ;
    }


    public static boolean solution(String[] phone_book) {
        boolean answer = true;



       HashMap<String,Integer>map = new HashMap<>();


       for(int i=0;i<phone_book.length;i++)map.put(phone_book[i], phone_book[i].length());

       
  


       for(String key : map.keySet()){
           for(int i =0;i<phone_book.length;i++){
               if(phone_book[i].contains(key)){
                   String str = phone_book[i].replaceFirst(key, "");
                   str = key + str;
                   if(str.equals(phone_book[i]) && !phone_book[i].equals(key) ) return false;
               }
           }
            
       }
      
       
        

       
       System.out.println(answer);
       
        return answer;
    }

}
