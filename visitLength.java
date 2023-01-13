import java.util.*;


class Location{
    int x,y;
    Location(int x, int y){this.x = x;this.y = y;}
 

    Location left(){return new Location(x-1,y);}
    Location right(){return new Location(x+1,y);}
    Location up(){return new Location(x,y+1);}
    Location down(){return new Location(x,y-1);}
}
class Position{
    int steps;
    Location location;
    Position(Location l, int s){location = l; steps = s;}
}

class visitLength {


  

    public static int solution(String dirs) {
      
        HashSet<String>set = new HashSet<>(); 

        int ans = 0;
        Queue<Position>Q = new LinkedList<>();

        Q.add(  new Position(new Location(0,0),1));

        
       
        for(int i=0;i<dirs.length();i++){

            Position now = Q.poll();
           
            
           
            


            if(dirs.charAt(i) == 'U') {
                Location temp = now.location.up();
             
                if( -5<= temp.x && temp.x <= 5 && -5<= temp.y && temp.y <=5){
                
                    Q.offer( new Position(now.location.up(),now.steps + 1));
                    //set.add(temp.x+","+temp.y);
                    set.add(now.location.x+","+now.location.y+"/"+temp.x+","+temp.y);  
                }else{
                    Q.offer(now);
                }
            }
            if(dirs.charAt(i) == 'D') {
                Location temp = now.location.down();
               

                if( -5<= temp.x && temp.x <= 5 && -5<= temp.y && temp.y <=5){
                       Q.offer( new Position(now.location.down(),now.steps + 1) );
                    
                       set.add(temp.x+","+temp.y+"/"+now.location.x+","+now.location.y);             
                }else{
                    Q.offer(now);
                }
            }
            if(dirs.charAt(i) == 'R'){
                Location temp = now.location.right();
                
                if( -5<= temp.x && temp.x <= 5 && -5<= temp.y && temp.y <=5){
                
                    Q.offer( new Position(now.location.right(),now.steps + 1) );
                     //set.add(temp.x+","+temp.y);
                    set.add(now.location.x+","+now.location.y+"/"+temp.x+","+temp.y);             
                }else{
                    Q.offer(now);
                }
            }
            if(dirs.charAt(i) == 'L'){
                Location temp = now.location.left();
               
                
                if( -5<= temp.x && temp.x <= 5 && -5<= temp.y && temp.y <=5){
                   Q.offer( new Position(now.location.left(),now.steps + 1) );
                   //set.add(temp.x+","+temp.y);
                   set.add(temp.x+","+temp.y+"/"+now.location.x+","+now.location.y);   
                }else{
                    Q.offer(now);
                }
            }

           
            

        }


        //System.out.println(set);


      
        return set.size();
    }
}
