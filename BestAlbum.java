import java.util.*;
/**
 * wordConversion
 */

/**
 * InnerwordConversion
 */
class MyData implements Comparable<MyData>{
    int index;
    int play;

    public MyData(int index, int play){
        this.index = index;
        this.play = play;
    }

    @Override
    public String toString() {
        
        return "index : "+index+" "+"play :"+play;
    }

    @Override
    public int compareTo(MyData o) {
       
        return this.play <= o.play ? 1 : - 1;
    }

  
}


class BestAlbum {

    public static void main(String[] args) {
        solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        ArrayList<Integer>result = new ArrayList<>();
      
        HashMap<String,Integer>map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i] );
        }

        //System.out.println(map);


        ArrayList<Integer>list = new ArrayList<>();

        for(String key: map.keySet()){
            list.add(map.get(key));
        }

        Collections.sort(list,Comparator.reverseOrder());

         //System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            ArrayList<MyData>sort = new ArrayList<>();
            for(String key:map.keySet()){
               
                if(map.get(key) == list.get(i)){
                  for (int j = 0; j < genres.length; j++){
                      if(genres[j].equals(key)){
                        sort.add(new MyData(j, plays[j]));
                       }
                  }
                }
               
            }

            Collections.sort(sort);
          //  System.out.println(sort);
             if(sort.size()>1){
            MyData data = sort.get(0);
            result.add(data.index);
            
            data = sort.get(1);
            result.add(data.index);
            }else if(sort.size() == 1){
                MyData my = sort.get(0);
                result.add(my.index);
            }

        }

   //     System.out.println(result);


        answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

   //     System.out.println(Arrays.toString(answer));
        return answer;
    }
}
