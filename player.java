import java.util.HashMap;


class  player{
    public String solution(String[] participant, String[] completion) {
        String answer = "";
         HashMap<String,Integer>map = new HashMap<>();

      for(String name : participant){
         if(!map.containsKey(name))map.put(name, 0);
         if(map.containsKey(name)){
           int count = map.get(name);
           count++;
           map.put(name, count);
         }
      }

    


      for(String name: completion){


         int count = map.get(name);
         count--;
         map.put(name, count);

      }

  


      for(String name : map.keySet()){
         if(map.get(name)!=0)answer+=name;
      }

    
        return answer;
    }
}
