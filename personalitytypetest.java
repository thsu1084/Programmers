import java.util.ArrayList;
import java.util.HashMap;

/**
 * test
 */
public class personalitytypetest{

    public static void main(String[] args) {
        solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        HashMap<String,Integer>map = new HashMap<>();
    
        int[] score = new int[]{3,2,1,0,1,2,3};

        
        


        for(int i=0;i<survey.length;i++){

           if(choices[i] < 4) 
           map.put( String.valueOf( survey[i].charAt(0) ), map.getOrDefault( String.valueOf( survey[i].charAt(0) ) , 0)+ score[choices[i]-1 ] );


           if(choices[i] > 4)
           map.put( String.valueOf( survey[i].charAt(1) ), map.getOrDefault( String.valueOf( survey[i].charAt(1) ) , 0)+ score[choices[i]-1] );
        }

        

        String[] types ={"R","T","C","F","J","M","A","N"};


        for(String key: types){
            if(!map.containsKey(key))map.put(key, 0);
        }

       

        for(int i=0;i<types.length;i=i+2){

           // System.out.println(types[i]+","+types[i+1]);

            if(map.get(types[i]) == map.get(types[i+1]))answer+=types[i];
            if(map.get(types[i]) > map.get(types[i+1]))answer+=types[i];
            if(map.get(types[i]) < map.get(types[i+1]))answer+=types[i+1];
        }

        


        return answer;
    }
}
