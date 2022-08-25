import java.util.*;


/**
 * test
 */

/**
 * Innertest
 */
class MyData implements Comparable<MyData>{

    int num;
    boolean isMine;

    public MyData(int num, boolean isMine){
        this.num = num;
        this.isMine = isMine;
    }
    




    @Override
    public String toString() {
       
        return String.valueOf(num) + String.valueOf(isMine);
    }





    @Override
    public int compareTo(MyData o) {
       
        return o.num-num;
    }



  
}

class Printer {




    public static void main(String[] args) {
    
        System.out.println( solution(new int[]{2, 2, 2, 1, 3, 4}, 3) );
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        List<MyData>list = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++)list.add(new MyData(priorities[i], i == location));


          while (!list.isEmpty()) {
            MyData m = list.remove(0);
            int count = list.size();

           // System.out.println(count);
            for(int i=0;i<list.size();i++){
                if(list.get(i).num>m.num){
                    list.add(m);
                    break;
                }
            }
          //  System.out.println(list+","+list.size());

            if(count != list.size()-1){
                answer++;
                if(m.isMine)return answer;
            }
        }
        return answer;
    }
}
