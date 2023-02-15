import java.util.*;
class Main{
  public static void main(String args[]){
    PriorityQueue<String> pq=new PriorityQueue<String>();
    pq.add("green");
    pq.add("pink");
    pq.add("black");
    System.out.println(pq);
    pq.offer("white");
    System.out.println(pq);
    
    
  }
}
