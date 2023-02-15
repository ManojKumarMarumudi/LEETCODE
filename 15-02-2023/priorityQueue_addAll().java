import java.util.*;
class Main{
  public static void main(String args[]){
    PriorityQueue<String> pq=new PriorityQueue<String>();
    pq.add("green");
    pq.add("pink");
    pq.add("black");
    PriorityQueue<String> pq1=new PriorityQueue<String>();
    pq1.add("yellow");
    pq1.add("blue");
    pq1.add("red");
    pq.addAll(pq1);
    System.out.println(pq);
    
    
  }
}
