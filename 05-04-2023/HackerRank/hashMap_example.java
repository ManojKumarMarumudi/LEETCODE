import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<input;i++){
            String str=sc.nextLine();
            int ph_no=sc.nextInt();
            sc.nextLine();
            hm.put(str,ph_no);
        }
        while(sc.hasNext()){
            String st=sc.nextLine();
            try{
                int out=hm.get(st);
                System.out.println(st+"="+out);
            }catch(Exception e){
                System.out.println("Not found");
            }
        }
    }
}
