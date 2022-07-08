import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * test1
 */
public class test1 {

    public static void main(String[] args) {
      System.out.println( solution("CBD",new String[] {"BACDE", "CBADF", "AECB", "BDA"}) ) ;
    }


    public static int solution(String skill, String[] skill_trees) {
        int answer = -1;


        ArrayList<String>list = new ArrayList<>();

       

       


        int count = 0;
        for(int i=0;i<skill_trees.length;i++){
            String s = "";
            for(int j=0;j<skill_trees[i].length();j++){
               
                char ch = skill_trees[i].charAt(j);

                if( skill.contains( String.valueOf(ch) ) ) s += String.valueOf(ch);
            }
            list.add(s);
        }

        System.out.println(list);


        count = list.size();
        for(int i=0;i<list.size();i++){

            if( list.get(i).length() == skill.length() && ! list.get(i).equals(skill) ) count-- ;
            if( list.get(i).length() != skill.length() ){
                for(int j=0;j<list.get(i).length();j++){
                     String str = skill;

                     if( ! list.get(i).contains( String.valueOf( skill.charAt(0) ) )  ){
                         count --;
                         break;
                     }
                     if(  skill.indexOf(  String.valueOf( list.get(i).charAt(j) ) ) != str.indexOf( skill.charAt(j) )  ){
                        count -- ;
                        break;
                     }
                }
            }

        }



        return count;
    }


   
    
}
