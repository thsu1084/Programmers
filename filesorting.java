import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthStyle;

public class  filesorting {



  

    public static void main(String[] args) {
        String[] files ={"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};

       System.out.println( Arrays.toString( solution(files) ));
    }


    public static String[] solution(String[] files) {
       String[] answer = new String[files.length];

       ArrayList<String>list = new ArrayList<>();





      
       Arrays.sort(files, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {

            String regex = "[0-9]";

            String str1 = o1.split(regex)[0];
            String str2 = o2.split(regex)[0];


          

           int rtn =  str1.toLowerCase().compareTo(str2.toLowerCase());

          
           if(rtn == 0){

              rtn =  Index0fNum(str1,o1) - Index0fNum(str2, o2);
           }


           return rtn;
            
        }
       });   

       
       
       
       
       
      


     
 
    return files;
        
  }

  static public int Index0fNum(String stronly, String fullsen){




    String result = fullsen.replaceFirst(stronly, "");
    

  //  System.out.println(result);


    String regex = "[a-zA-Z]";
    String number = result.split(regex)[0];

   // System.out.println(number);
    int count = 0;
    String numofstr = "";
    for(char ch : number.toCharArray()){

      if(48<=ch&&ch<=57&&count<5){
        numofstr+=ch;
        count++;
      }else break;
    }



    

    return Integer.valueOf(numofstr);

  }
}

