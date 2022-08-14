import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;



import java.text.BreakIterator;
import java.util.Stack;


public class bracket {

    public static void main(String[] args) {
        System.out.println( solution("()))((()") );
        
    }
    public static String solution(String p) {
        String answer = "";

        if(p.length() == 0)return answer;

        return mainMethod(p);



        
    }


    public static Boolean perfect(String s){
        
        Boolean answer = true;
        
        Stack<Character>stack = new Stack<>();

        for(int i=0;i<s.length();i++){


            if(s.charAt(i) == '(')stack.push('(');
            else{
                if(stack.isEmpty())return false;
                else if(s.charAt(i) == ')')stack.pop();
            }


        }

        if(stack.isEmpty())return true;
        else return false;

       
    }

    


    public static String manufacture(String s){
        String answer = "";


        String str = s; 

        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i) == '(')answer+=")";
            else answer+="(";
        }

        
        return answer;
    }


    public static String mainMethod(String s ){

        String answer = "";

        if(s.length() == 0) return "";
        
        String u ="";
        String v= "";
        
        int count = 0;
        for(int i =0;i<s.length();i++){ 
           
            if(s.charAt(i) == '(') count++;    
            else count--;
            
            
            if(count == 0){
               
                u = s.substring(0,i+1);
                v = s.substring(i+1);
                
               
                if(perfect(u)){
                 
                    return u + mainMethod(v); 
               
                }else{
                   
                    
                    return "("+ mainMethod(v) + ")" + manufacture(u);
                }  
                
            }
        }
       
       return u;        
       
    }
}



