import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Openchat {
    
   // static ArrayList<String>list = new ArrayList<>();
    static HashMap<String,String>map = new HashMap<>();
   // static ArrayList<String>word = new ArrayList<>();
    static ArrayList<String>result = new ArrayList<>();
    public static void main(String[] args) {
        String[] record ={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println( Arrays.toString( solution(record) ));
    }

    public static String[] solution(String[] record) {
        String[] answer = {};


       
        

        for(int i=0;i<record.length;i++){
            

            String[] str = record[i].split(" ");
            
           if(str[0].equals("Change")||str[0].equals("Enter")){
 
                map.put(str[1], str[2]);
                

              }
        }

//        System.out.println(set);




       

        for(int i=0;i<record.length;i++){
            String[] str = record[i].split(" ");

           if(str[0].equals("Enter"))result.add( map.get(str[1]) +"님이 들어왔습니다." );
           if(str[0].equals("Leave"))result.add(map.get(str[1]) +"님이 나갔습니다." );
        }


        answer = new String[result.size()];
        for(int i=0;i<result.size();i++)answer[i] =  result.get(i);

        return answer;
    }
}
