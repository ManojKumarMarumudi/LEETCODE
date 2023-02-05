import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        Stack <Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.contains(str.charAt(i))==false){
                st.push(str.charAt(i));
            }
        }
        Iterator<Character> itr=st.iterator();
            while(itr.hasNext()){
                String res=itr.next().toString();
                System.out.print(res);
            }
    }
}
