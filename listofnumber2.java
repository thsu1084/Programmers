import java.util.*;

/**
 * test
 */
public class  listofnumber2{

    public static void main(String[] args) {
        solution(new String[]{"119", "97674223", "1195524421"});
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;


       
        Arrays.sort(phone_book);

        //System.out.println(Arrays.toString(phone_book));

        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i]))return false;
        }


        return answer;
    }
}
