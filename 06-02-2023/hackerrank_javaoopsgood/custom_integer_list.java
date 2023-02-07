import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class IntegerList{
    private List<Integer> list;
    private int index=0;
    private int size;
    public IntegerList(int size){
        this.size=size;
        list = new ArrayList<>();
    }
    public void add(int n){
        if(index>size-1){
            System.out.println("can't add, list is full");
        }
        else{
            list.add(n);
            index+=1;
        }   
    }
    public void toStrin(){
        int j=0;
        for(int i:list){
            System.out.println(j+" : "+i);
            j+=1;
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int siz = Integer.parseInt(in.nextLine());
        IntegerList obj = new IntegerList(siz);
        while(in.hasNextLine()){
            int number = Integer.parseInt(in.nextLine());
            obj.add(number);
        }
        obj.toStrin();
        }
    }
