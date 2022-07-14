import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * test
 */
public class news {


  static ArrayList<String>s1 = new ArrayList<>();
  static ArrayList<String>s2 = new ArrayList<>();

  static ArrayList<String>intersection = new ArrayList<>();

  static ArrayList<String>union = new ArrayList<>();

  public static void main(String[] args) {
  
    solution("FRANCE", "french");
  }


  public static int solution(String str1, String str2) {
    int answer = 0;

    while(str1.length()>1){
    
      String temp =  str1.substring(0,2);
     
     
      if(65<=temp.toUpperCase().charAt(0)&&temp.toUpperCase().charAt(0)<=90&&65<=temp.toUpperCase().charAt(1)&&temp.toUpperCase().charAt(1)<=90)
      s1.add(temp.toUpperCase());
      str1 =str1.substring(1);
    }


    while(str2.length()>1){
    
      String temp =  str2.substring(0,2);

      if(65<=temp.toUpperCase().charAt(0)&&temp.toUpperCase().charAt(0)<=90&&65<=temp.toUpperCase().charAt(1)&&temp.toUpperCase().charAt(1)<=90)
      s2.add(temp.toUpperCase());
      str2 =str2.substring(1);
    }
    

    Collections.sort(s1);
    Collections.sort(s2);

  

    for(String key: s1){


      if( s2.contains(key)){
        
         intersection.add(key);
        
         s2.remove(key);
      }
      
      union.add(key);
      
 
     }


     for(String key :s2)union.add(key);


  

    if(union.size() == 0) return 65536;
    double result = ( (double)intersection.size()/(double)union.size())*65536;
    answer = (int)result;
    
    return answer;
  }


}

