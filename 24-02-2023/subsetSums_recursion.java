import java.util.* ;
import java.io.*; 
public class Solution {
    public static void ans(int index,int sum ,int[] num , int n,ArrayList<Integer>sumset){
        if(index==n){
            sumset.add(sum);
            return;
        }
        ans(index+1,sum+num[index],num,n,sumset);
        ans(index+1,sum,num,n,sumset);

    }
        public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> sumset = new ArrayList<>();
        int sum = 0;
        int n = num.length;
        ans(0,sum,num,n,sumset);
        Collections.sort(sumset);
        return sumset;
    }

}
