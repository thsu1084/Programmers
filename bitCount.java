public class bitCount {

    public static void main(String[] args) {
        solution(78);
    }

    public static int solution(int n) {
        int answer = 0;
        

        int taget = Integer.bitCount(n);

       for(int i=n+1;i<Integer.MAX_VALUE;i++){


        if(Integer.bitCount(i) == taget)return i;
       
       }

      

        return answer;
    }
}
