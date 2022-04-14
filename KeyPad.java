import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import javax.print.attribute.HashDocAttributeSet;

public class KeyPad {
    

    public static void main(String[] args) {
        int[] arr= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(arr,"left").equals("LRLLRRLLLRR") );
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";

        List<Integer>Lindex = new ArrayList<>();
        Lindex.add(3);
        Lindex.add(0);
        List<Integer>Rindex = new ArrayList<>();
        Rindex.add(3);
        Rindex.add(2);

        for(int i=0;i<numbers.length;i++){
           if( numbers[i]%3==1){//Left
              answer+="L";
              
              Lindex = new ArrayList<>();
              Lindex.add(numbers[i]/3);
              Lindex.add(0);
           }else if(numbers[i]%3==0&&numbers[i]!=0){//Right
              answer+="R";

              Rindex = new ArrayList<>();
              Rindex.add(numbers[i]/3-1);
              Rindex.add(2);

           }else{//Middle
              int Xmid= numbers[i]/3;
              if(numbers[i]==0) Xmid=3;
              int Ymid=1;
              
              
              ///left
              int x=Xmid-Lindex.get(0);
              int y=Ymid-Lindex.get(1);
              
              if(x<0)x=x*-1;
              if(y<0)y=y*-1;
              
              int num1=x+y;
              
              //right
              x=Xmid-Rindex.get(0);
              y=Ymid-Rindex.get(1);


              if(x<0)x=x*-1;
              if(y<0)y=y*-1;
              
              int num2=x+y;
               
            //  System.out.println(numbers[i]+" X:"+Xmid);
            //  System.out.println(numbers[i]+" Y:"+Ymid);
              if(num1>num2){
                  answer+="R";
                  Rindex = new ArrayList<>();
                  Rindex.add(Xmid);
                  Rindex.add(Ymid);
              }
              else if(num1<num2)
              {
                   
                   answer+="L";
                   Lindex = new ArrayList<>();
                   Lindex.add(Xmid);
                   Lindex.add(Ymid);
              }else{
                  if(hand.equals("right")){
                    answer+="R";
                    Rindex = new ArrayList<>();
                    Rindex.add(Xmid);
                    Rindex.add(Ymid);
                  }else{
                    answer+="L";
                    Lindex = new ArrayList<>();
                    Lindex.add(Xmid);
                    Lindex.add(Ymid);
                  }
              }
           }

        //   System.out.println(numbers[i]+":"+Lindex);
        //   System.out.println(numbers[i]+": "+Rindex);
        
        }


        //System.out.println(answer);
        return answer;
    }


   

}
