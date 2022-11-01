import java.util.*;

class shuttlebus {
    public static String solution(int n, int t, int m, String[] timetable) {
        String answer ="";
        TreeMap<Integer,Stack<Integer>>map = new TreeMap<>();
        ArrayList<Integer>list = new ArrayList<>();
       
       for(String temp: timetable){
            list.add(parseInt(temp));
       }
       
       
        
       int start = 60*9;
        
       map.put(start, new Stack<Integer>());
       for(int i=0;i<n-1;i++){
           start = start + t;
           map.put(start, new Stack<Integer>());
       }
       
    
        
       Collections.sort(list); 
     
        int count = 0;
        
     
        for(Integer key : map.keySet()){
            Stack<Integer>stack = new Stack<>();
            if(key == 540){
                
                   
                   for(int i=0;i<list.size();i++){
                       if(list.get(i)<=540 && count<m){
                           stack.push(list.get(i));
                           list.set(i,0) ;
                           count++;
                       }
                   }
                
                
                map.put(key,stack);
            }
            else{
                for(int i=0;i<list.size();i++){
                    
                    if(list.get(i) < key && list.get(i) != 0 && count< m){
                        stack.push(list.get(i));
                        list.set(i,0);
                        count++;
                    }
                    if(key-t<list.get(i) && list.get(i)<=key && count< m){
                        stack.push(list.get(i));
                        list.set(i,0);
                        count++;
                    }
                }
             
                map.put(key,stack);
            }
            count = 0;
        }
        
        
        ArrayList<Integer>key = new ArrayList<>(map.keySet());
        
        
        
        
            
           Stack<Integer>left = map.get(key.get(key.size()-1));
     
        int num = 0;
        if(left.size() < m){
            num = key.get(key.size()-1);
        }else if(left.size() ==  m ){
            num = left.pop()-1;
        }
        
       
        String hour   = Integer.toString(num/60);
        String min = Integer.toString(num%60);
        
        hour = hour.length() < 2 ? "0"+hour : hour;
        min = min.length() < 2 ? "0"+min : min;
        return hour+":"+min;
        
       
    }
    
    private static int parseInt(String time){

        String[] strArr = time.split(":");
        
        return Integer.parseInt(strArr[0])*60 + Integer.parseInt(strArr[1]);
    }
}
