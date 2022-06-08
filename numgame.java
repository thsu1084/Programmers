public class numgame {
    public static void main(String[] args) {
        solution(2,4,2,1);
    }

    public static String solution(int n, int t, int m, int p) {
      String answer = "";


        String s = "";


        int num = 0;
        int sum = 0;
       
      
        for(int i=0;i<t*m;i++){
           
            if(sum>t*m)break;
            else{
           
            sum=sum+Integer.toString(i,n).length();
            s = s + Integer.toString(i,n);
            }
        }

     //   System.out.println(s);



        int count = 0;
        for(int i=0;i<s.length();i++){

 
            if(i%m==0){
            String str = s.substring(i);
           // System.out.println(str);
            if(count<t){
            answer+= str.charAt(p-1) ;
            count++;
            }
            }

        }

       //System.out.println(answer);

       return answer.toUpperCase();
    
    }
}
