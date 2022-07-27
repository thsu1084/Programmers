import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//알고리즘 읽고 구현하기 
/**
 * test
 */
public class PrimeNumber {


  static ArrayList<String>result = new ArrayList<>();

  static ArrayList<Integer>extra = new ArrayList<>();
  static ArrayList<Character>list = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println( solution("011") );
  }

  public static int solution(String numbers) {
    int answer = 0;

  

    for(int i=0;i<numbers.length();i++)list.add(numbers.toCharArray()[i]);

    Collections.sort(list, Collections.reverseOrder());

    


    for(int i=0;i<10;i++){
      
      if(list.contains(Character.forDigit(i, 10) ))continue;
      else extra.add(i);
    }

    
    String str ="";

    for(int i=0;i<list.size();i++)str+=list.get(i);

   


    for(int i =0;i<=Integer.parseInt(str);i++){

     
      if( isPrime(i) == 1 && isContain(i) ==1 && isFrequency(i) ==1 && i != 0 && i != 1)result.add(  String.valueOf(i) );
    }

//    System.out.println(result);

    
     answer = result.size();

    return answer;
  }


  public static int isPrime(int n) {

    for (int i = 2; i<=(int)Math.sqrt(n); i++) {
        if (n % i == 0) {
            return 0;
        }
    }

    return 1;
  }



  public static int isContain(int n) {

    String var = String.valueOf(n);

    
    for(int j=0;j<var.length();j++){
      

     if(extra.contains( Integer.parseInt( String.valueOf( var.charAt(j)) ))){
      
      return 0;
     }

    }
  
    return 1;

  }


  public static int isFrequency(int n) {

    String var = String.valueOf(n);

    
    for(int j=0;j<var.length();j++){
      

     if(list.contains( var.charAt(j) )){
      

      int num1 = Collections.frequency(list, var.charAt(j));

      int num2 = var.length() - var.replaceAll(String.valueOf( var.charAt(j) ), "").length();


      
      if(num1<num2)return 0;
     }

    }
  
    return 1;

  }


}
