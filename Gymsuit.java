import java.util.*;



class Gymsuit {

    public static void main(String[] args) {
        solution(5,new int[]	{2, 4}, new int[]	{1, 3, 5});
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;


        int[] students = new int[n];

       
        for (int i = 0; i < students.length; i++) {
            students[i] = 1;
        }

        for (int i = 0; i < lost.length; i++) {
            students[lost[i]-1]--;
        }

        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i]-1]++;
        }

       // System.out.println(Arrays.toString(students));

        for (int i = 0; i < students.length; i++) {
            if( i ==  0){
                if(students[i] == 2 && students[i+1] == 0){
                    students[i]--;
                    students[i+1]++;
                }
            }else if( i == students.length-1){
                if(students[i] == 2 && students[i-1] == 0){
                    students[i]--;
                    students[i-1]++;
                }
            }else{
                if(students[i] == 2){
                    if(students[i-1] == 0){
                         students[i]--;
                         students[i-1]++;
                    }else if(students[i+1] == 0){
                          students[i]--;
                          students[i+1]++;    
                    }
                }
            }
        }


        for (int i = 0; i < students.length; i++) {
            if(students[i] == 0)n--;
        }

       // System.out.println(Arrays.toString(students));
        return n;
    }
}
