import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();           
        for (int test = 0; test < queries; test++) {
            int current = sc.nextInt();
            if (current == 1) {
                enqueue(sc.nextInt());
            } else if (current == 2) {
                dequeue();
            } else {
                int peeked = peek();
                System.out.println(peeked);
            }       
        }
        sc.close();  
    }  
    static Stack<Integer> enStack = new Stack<>();
    static Stack<Integer> dqStack = new Stack<>();
    public static void enqueue(int value) {
        enStack.push(value);
    }
    private static void refillDequeue() {
        if(dqStack.isEmpty()) {
            while(!enStack.isEmpty()) {
                dqStack.push(enStack.pop());
            }
        }
    }
    public static int dequeue() {
        refillDequeue();
        return dqStack.pop();  
    }
    public static int peek() {
        refillDequeue();
        return dqStack.peek();
    }
}
