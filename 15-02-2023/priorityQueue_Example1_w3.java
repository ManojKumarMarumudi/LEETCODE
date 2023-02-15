import java.util.*;
class Main{
  public static void main(String args[]){
    PriorityQueue<String> pq=new PriorityQueue<String>();
    pq.add("green");
    pq.add("pink");
    pq.add("black");
    Iterator itr=pq.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
