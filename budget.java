public class budget {

    public static void main(String[] args) {
        solution(new int[]{120, 110, 140, 150}, 485);
    }

    public static int solution(int[] budgets, int M) {
        int answer = 0;

       
        int Max = 0;
        for (int i = 0; i < budgets.length; i++) {
            if(Max < budgets[i])Max = budgets[i];
        }

      //  System.out.println(Max);

        int pl = 0;
        int pr = Max;

        int pc = 0;

        while (pl <= pr) {
            pc = (pl + pr)/2;

            int sum = 0;
            for (int i = 0; i < budgets.length; i++) {
                if(budgets[i] > pc)sum+=pc;
                else sum+=budgets[i];
            }

            if(sum <= M){
                pl = pc + 1;
                answer = pc;
            }
            else{
                
             pr = pc - 1;
            }
        }
       // System.out.println(pc);

        return answer;
    }
}
