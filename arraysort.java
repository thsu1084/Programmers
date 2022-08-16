import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * test
 */


/**
 * MyData
 */


class MyData {

    String str;

    String sub;
    public MyData(String str,String sub){
        this.str = str;
        this.sub = sub;
    }
  
    @Override
    public String toString() {
        
        return String.valueOf(str);
    }
}


class arraysort {





    public static void main(String[] args) {
        solution(new String[]{"sun", "bed", "car"},1);
    }

  
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};


        ArrayList<MyData>list = new ArrayList<>();

        for(int i=0;i<strings.length;i++){
            String str = strings[i].charAt(n) + strings[i];
            list.add(new MyData(strings[i], str));
        }

       list.sort(new Comparator<MyData>() {
           
        @Override
        public int compare(MyData arg0, MyData arg1) {
            
            return arg0.sub.compareTo(arg1.sub);
        }
       });

      

        answer = new String[list.size()];

        for(int i=0;i<list.size();i++)answer[i] = list.get(i).str;

        return answer;
    }
}
