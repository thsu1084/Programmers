import java.util.Arrays;
class secretMap {
     public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer =  new String[n];


        for(int i=0;i<n;i++){
       
           String result = Integer.toBinaryString(arr1[i]|arr2[i]);

          
           int count = n - result.length();

           String sub = "";
           for(int j=0;j<count;j++)sub+='0';


           result = sub + result;

            
            
           String temp ="";

          
           for(int j=0;j<result.length();j++){
               if(result.charAt(j) == '1')temp+='#';
               else if(result.charAt(j) == '0')temp+=' ';
           }
           answer[i] = temp;
        }



      
        return answer;
    }
}
