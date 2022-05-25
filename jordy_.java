import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

class jordy_ {
  static  ArrayList<Integer>list = new ArrayList<>();

    static int count=0;

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves={1,5,3,5,1,2,1,4};
        System.out.println( solution(board,moves) );
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;


        stack.add(0);


        //System.out.println(board.length);
       for(int i=0;i<moves.length;i++){


       
        ArrayList<Integer>num = new ArrayList<>();

        
       
        int index = 0;
        for(int j=0;j<board.length;j++){
    
        if(board[j][moves[i]-1]!=0){

        
        if(stack.get(stack.size()-1)==board[j][moves[i]-1]){    
        stack.pop();
        answer+=2;
        }
        else {
            stack.add(board[j][moves[i]-1]);
        }
        board[j][moves[i]-1]=0;
       
        break;
        }

        }
      
      
       

       // System.out.println(answer);
        
        

     

       }

     
      
       
        return answer;
    }
}
