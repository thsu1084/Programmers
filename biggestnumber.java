import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * wordConversion
 */
public class biggestnumber{

    public static void main(String[] args) {
        solution(new int[]{3, 30, 34, 5, 9});
       
    }

    public static String solution(int[] numbers) {
        String answer = "";

        
       
        String[] str = new String[numbers.length];


        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf( numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>(){

            @Override
            public int compare(String arg0, String arg1) {
                
                return (arg1+arg0).compareTo(arg0+arg1);
            }
            
        });


  

        for (int i = 0; i < str.length; i++) {
            answer+=str[i];
        }


        if(str[0].equals("0"))return "0";
        
        return answer;
    }
}
