import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class lotto {
    
    static ArrayList<String>list = new ArrayList<>();
    
    public static int[] solution(int[] lottos, int[] win_nums) {
         int[] answer = {0,0};

        int min = 0;

        HashMap<Integer,Integer>map = new HashMap<>();


        map.put(2, 5); map.put(3, 4); map.put(4, 3); map.put(5, 2); map.put(6, 1);


        ArrayList<String>win = new ArrayList<>();

        for(int i=0;i<win_nums.length;i++)win.add( String.valueOf(win_nums[i]));

        for(int i=0;i<lottos.length;i++)list.add( String.valueOf(lottos[i] ) );
  
       

        for(int i=0;i<lottos.length;i++){
            if(list.contains(win.get(i)))min++;
        }

    


        


        //answer = new int[2];


        if(min>1)
        answer[1] = map.get(min);
        else answer[1] = 6;

       
        for(int i=0;i<lottos.length;i++){
            if(list.get(i).equals("0")){
               // System.out.println(list.get(i));
                min++;
            }
        }

       

        if(min==0)answer[0] = 6;
        else answer[0] = map.get(min);


        System.out.println( Arrays.toString(answer) );

        return answer;
    }
}
