import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * dart
 */
public class dart {


    static HashMap<String,Double>map = new HashMap<>();
    static ArrayList<String>list = new ArrayList<>();

    static ArrayList<String>result = new ArrayList<>();
    public static void main(String[] args) {
        solution("1D#2S*3S");
    }

    public static int solution(String dartResult) {
      
        int answer = 0;


        String str = "";

        for(int i=0;i<dartResult.length();i++){
        
            str += dartResult.charAt(i);
            if(dartResult.charAt(i)=='S'||dartResult.charAt(i)=='D'||dartResult.charAt(i)=='T'||dartResult.charAt(i)=='#'||dartResult.charAt(i)=='*')str+=" ";
        }

       


        String[] arrstr = str.trim().split(" ");

       

       


        
        for(int i=0;i<arrstr.length;i++){
            if(arrstr[i].contains("S")|| arrstr[i].contains("D")||arrstr[i].contains("T")) list.add(arrstr[i]);
  
        }



        for(int i = 0 ;i<=10;i++){
            String num = String.valueOf(i);
            map.put(num+"S", Math.pow(i, 1));

            map.put(num+"D", Math.pow(i, 2));

            map.put(num+"T", Math.pow(i, 3));

        }




        

        for(int i = 0;i< arrstr.length;i++){
            
            if(arrstr[i].equals("*")&&(i-2)>=0)arrstr[i-2]+="*";
           
        }


        for(int i=0;i<arrstr.length;i++)arrstr[i] = arrstr[i].replace("*", "2");


        for(int i=0;i<arrstr.length;i++)arrstr[i] = arrstr[i].replace("#", "-1");



        dartResult = "";
       for(int i =0; i<arrstr.length;i++)dartResult+=arrstr[i];

       //System.out.println(dartResult);


       String sen = "";
       int area = 0;


       for(int i=1;i<list.size();i++){


        int index = dartResult.indexOf(list.get(i));
      


        sen = dartResult.substring(0, index);

       

        result.add(sen);

               
   

        dartResult = dartResult.substring(index);

        

       }

    

       if( list.get(list.size()-1).charAt(1) == 'S')area = 1;
       if( list.get(list.size()-1).charAt(1) == 'D')area = 2;
       if( list.get(list.size()-1).charAt(1) == 'T')area = 3;




       result.add(dartResult);



       

       for(int i=0;i<result.size();i++){


        double cal = 1;
        String s = result.get(i);

        s =  s.replace(list.get(i), "");

     


        for(int j=0;j<s.length();j++){
            if(   (int)s.charAt(j)-'0'  == -3 )cal = cal * -1;
            else cal = cal * ( (int)s.charAt(j) - '0') ;
        }
       
       cal = cal * map.get(list.get(i));
    

        answer+=cal;
       }


     

        return answer;
    }
}
