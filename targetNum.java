public class targetNum {

    public static void main(String[] args) {
       System.out.println( solution(new int[]{1, 1, 1, 1, 1}, 3) );
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;


        return sumCount(numbers,target,0,0);
    }

    private static int sumCount(int[] numbers, int target, int i, int sum) {


        if(numbers.length == i){
            if( sum == target )return 1;
            return 0;
        }


        return sumCount(numbers, target, i+1, sum+numbers[i])+
        sumCount(numbers, target, i+1, sum-numbers[i]);
    }
}
