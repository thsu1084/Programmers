import java.util.ArrayList;
import java.util.Collections;

/**
 * test
 */
public class change {

  static int sum = 0;

  static int index = 0;  

  public static void main(String[] args) {
    solution("110010101001");
  }


  public static int[] solution(String s) {
    int[] answer = new int[2];


    while(s.length()>1){


    ArrayList<String>list = new ArrayList<>();
    for(int i =0; i<s.length();i++)list.add( String.valueOf(s.charAt(i)) );


    int frequency = Collections.frequency(list, "0");

    sum += frequency;

    s = s.replaceAll("0", "");

   // System.out.println(s+" "+frequency);

    int length = s.length();


    String binary = Integer.toBinaryString(length);

   // System.out.println(binary);

    s = binary;
    
    index++;    
  
    }

    

      
    answer[0] = index;
    answer[1] = sum;  
      
      
    return answer;
  }
}
