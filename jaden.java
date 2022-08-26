import java.util.Arrays;

/**
 * test
 */
public class jaden {

    public static void main(String[] args) {
        solution("3people  unFollowed me");
    }

    public static String solution(String s) {
        String answer = "";


       
        String[] strarr = s.split(" ");

        for(int i=0;i<strarr.length;i++){
            String str = strarr[i];
            if(str.isEmpty()){
                answer+=str+" ";
            }else{
                str = str.toLowerCase();
          
            
               if(str.length() == 1){
                answer+= str.toUpperCase()+" ";
                   
               }else{
               str  = str.substring(0, 1).toUpperCase()+str.substring(1);
               answer+=str+" ";
                }

               
            }
        }


        return answer.trim();
    }
}
