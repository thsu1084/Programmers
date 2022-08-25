import java.util.*;



public class endtalk2 {



    public static void main(String[] args) {
        int[] result = solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}) ;
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};

        ArrayList<String>list = new ArrayList<>();
       
        for(int i=0;i<words.length;i++){


            if(i>0){
            if(words[i-1].toCharArray()[words[i-1].length()-1] != words[i].toCharArray()[0]){
               // System.out.println(i);
                return new int[]{(i%n)+1,(i/n)+1};
            }
            }

            if(list.contains(words[i]))return new int[]{(i%n)+1,(i/n)+1};

            list.add(words[i]);
        }
        

        return answer;
    }
}
