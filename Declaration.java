import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


class Declaration{
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,String>map = new HashMap<>();
        HashMap<String,Integer> var = new HashMap<>();
        
        
        for(int i=0;i<id_list.length;i++)
        map.put(id_list[i], "");

      
        for(int i=0;i<report.length;i++){
            String[] strng = report[i].split(" ");
            String abc="";
            for(int j=1;j<strng.length;j++)
               abc=abc+strng[j]+" ";
             map.put(strng[0],map.get(strng[0])+abc);
        }
      //  System.out.println("map"+map);
        
        for(int z=0;z<id_list.length;z++)
        var.put(id_list[z], 0);
      
     


       
        int count=0;
        HashSet<String>set = new HashSet<>();
        for(int w=0;w<answer.length;w++){
           // System.out.println(map.get(id_list[w]));
            String tmp1=map.get(id_list[w]);
         //   System.out.println(var.get(tmp1));
            
            if( tmp1.isBlank())continue;
           // System.out.println(tmp1);
            String[] strng = tmp1.trim().split(" ");
           



          
            for(int q=0;q<strng.length;q++){
                set.add(strng[q].trim());
            }

            

           
           

           
            for(String j: var.keySet()){
                if(set.contains(j))
                var.put(j,var.get(j)+1);
            }
          //  System.out.println(set);
          //  System.out.println(var);
            set = new HashSet<>();



           
        }









        for(int w=0;w<answer.length;w++){
            // System.out.println(map.get(id_list[w]));
             String tmp1=map.get(id_list[w]);
          //   System.out.println(var.get(tmp1));
             
             if( tmp1.isBlank())continue;
           //  System.out.println(tmp1);
             String[] strng = tmp1.trim().split(" ");
            
 
 
 
           
             for(int q=0;q<strng.length;q++){
                 set.add(strng[q].trim());
             }
 
             
 
            
            for(String tmp : var.keySet()){
                if(var.get(tmp)>=k){
                    if(set.contains(tmp))
                    count++;
                }
            }
 
       //     System.out.println(id_list[w]+":"+count);
       
             set = new HashSet<>();
             if(count==0)answer[w]=0;
             answer[w]=count;
             count=0;
 
 
            
         }
 
       



      //  for(int i=0;i<answer.length;i++)
      //  System.out.println(answer[i]);
        return answer;
       
    }
}
