import java.util.*;

class Solution {
  
   
    public static int solution(int n, int k) {
        int answer = 0;
        String str="";

        if(n==0||n<k) return 0; //결과 값이 0이 나오는 경우 
      
        while(n>0){  //나머지 값을 구하여 문자열에 순서대로 저장
           
            str+=(n%k);
            n=n/k;
        }

        StringBuilder sb = new StringBuilder(str); // reverse  를 하기 위해 StringBuilder 선언한다.
      
        
        String newstr=sb.reverse().toString(); //revers 한 StringBuilder를 String으로 변환하여 새로운 String 변수에 저장
       
       
        String[] array = newstr.split("0");//문자열을 0을 기준으로 자른다.
        
        
        for(long i=0;i<array.length;i++){

            

           
            if(array[(int) i].equals("0"))continue;//0 문자열인 경우 그냥 통과
            else{
                if(!array[(int) i].equals("")){ //문자열이 공백이 아닐 때 값을 long 으로 변환 한다. 
                 if(isPrimeNumber(Long.parseLong(array[(int) i]))==true)answer++; //isPrimeNumber가 참인 경우 answer 변수의 값을 +1 한다.
                }
            }
열
        }

        
        return answer;
    }
    
    

    public static boolean isPrimeNumber(Long x) {
       

        long index=(long) Math.sqrt(x);
        if(x<2)return false;
        if(x==2)return true;
        for(long i=2;i<=index;i++){
            if(x%i==0)return false;
        }
        return true;
      
    }

}
