import java.util.*;

/**
 * test
 */
class Node{
    int n;
    int distance = 0;
    boolean visit = false;
    List<Node> links = new LinkedList<>();
    Node(int n){this.n = n;}
}

class  farthestNode {


    
    
    public static void main(String[] args) {
        solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});
    }

    public static int solution(int n, int[][] edge){

        int answer = 0;

        int count = 0;
        List<Node>list = new ArrayList<>();
        for(int i=0;i<n;i++)list.add(new Node(i+1));


       for(int[] e : edge){
           Node n1 = list.get(e[0]-1);
           Node n2 = list.get(e[1]-1);
           n1.links.add(n2);
           n2.links.add(n1);
       }


       
       Queue<Node> queue = new LinkedList<>();

       queue.offer(list.get(0));

       Node first = list.get(0);

       first.visit = true;
    
       while (!queue.isEmpty()) {
           Node temp = queue.poll();
          
           for(Node node : temp.links){
               if(node.visit)continue;

               node.visit = true;
               node.distance = temp.distance + 1;
               queue.offer(node);



               answer = Math.max(answer, node.distance);
           }
           
       }



       for(int i=0;i<list.size();i++){
           if( list.get(i).distance == answer )count++;
       }


        return count;
    }
}
