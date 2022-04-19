import java.util.*;

import javax.swing.LayoutStyle;
import javax.swing.event.MenuDragMouseEvent;


class fee {
      public static int[] solution(int[] fees, String[] records) {
        
        HashSet<String>set = new HashSet<>();
       List<List>fi = new ArrayList<>();
        for(int i=0;i<records.length;i++){
            String[] strng = records[i].split(" ");
            set.add(strng[1]);
        }
       
        List<String> st = new ArrayList<>(set);
        st.sort(null);
      

        List<String> sen = new ArrayList<>();
        for(int j=0;j<st.size();j++){
        for(int i=0;i<records.length;i++){
            String str = records[i];
            Boolean result= str.contains(st.get(j));
          
            if(result==true)
            sen.add(str);
        }
          fi.add(sen);
          sen = new ArrayList<>();
        }  
     

        int[] answer = new int[st.size()];
       
        for(int i=0;i<fi.size();i++){
           
         double  result = parkingFee(fi.get(i),fees);


        answer[i]=(int)Math.round(result);
           
        }

        for(int i=0;i<answer.length;i++)
        System.out.println(answer[i]);
        return answer;
    }


    public static double parkingFee(List<String> list,int[] fee){

         List<Integer> fe = new ArrayList<>();
        List<String> var = new ArrayList<>(list);
        List<HashMap<Integer,Integer>>answer= new ArrayList<>();
        int rt=0;

      for(int i=0;i<var.size();i++){
     
      String[] strng = var.get(i).split(" "); 
     
      String[] clock =  strng[0].split(":");
      HashMap<Integer,Integer> minhou= new HashMap<>();
      if(Integer.valueOf(clock[1])==null)
      minhou.put(Integer.valueOf(clock[0]), 0);
      
      minhou.put(Integer.valueOf(clock[0]), Integer.valueOf(clock[1]));
      answer.add(minhou);
      }
      if(answer.size()%2!=0)
        {
            HashMap<Integer,Integer> minhou= new HashMap<>();
            minhou.put(Integer.valueOf("23"), Integer.valueOf("59"));
            answer.add(minhou);
        }


        int index=0;
        int key1=0;
        int key2=0;
        int key3=0;
        int key4=0;
       int i=0;
       
        for(i=0;i<answer.size()-1;i+=2){

        
             HashMap<Integer, Integer>map1 = answer.get(i);
 
            
             HashMap<Integer, Integer>map2 = answer.get(i+1);
             
         

           for(Integer tmp : map1.keySet())
           {
             key1=tmp;
             key2 = map1.get(tmp);
           }

          
           for(Integer tmp : map2.keySet())
           {
             key3=tmp;
             key4 = map2.get(tmp);
           }

         
           int min1=(key3-key1)*60;
       
           int min2=key4-key2;
        

         

          fe.add(min1+min2);

        }
   

        double bio= 0;
        for(int w=0;w<fe.size();w++){
         bio+=fe.get(w);
        }

     
       if(bio>fee[0]){ 
       bio= fee[1] + Math.ceil(((double)bio-(double)fee[0])/(double)fee[2]) *fee[3];
       }
       else{
           bio = fee[1];
       }

     
        return bio;
    }

}
