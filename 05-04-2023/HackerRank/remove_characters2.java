import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        HashSet<Character> set = new HashSet<>();
        for (int i=0; i<s2.length();i++) {
          set.add(s2.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s1.length();i++) {
          if (!set.contains(s1.charAt(i))) {
            sb.append(s1.charAt(i));
             
          }else{
              set.remove(s1.charAt(i));
          }
        }
        System.out.println(sb.toString());
    
