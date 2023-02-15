import java.util.*;
class Main{
  public static void main(String args[]){
    PriorityQueue<String> pq=new PriorityQueue<String>();
    pq.add("green");
    pq.add("pink");
    pq.add("black");
    List<String> lst = new ArrayList<>(pq);
    System.out.println(lst);
    
    
  }
}
