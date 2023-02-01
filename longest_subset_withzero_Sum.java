import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> hm=new HashMap<>();
		int sum=0;
		int maxi=0;
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
			if(sum==0){
					maxi=i+1;
			}
			else{
				if(hm.get(sum)!=null){
					maxi=Math.max(maxi,i-hm.get(sum));
				}else{
					hm.put(sum,i);
				}
			}
			
		}
		return maxi;
	}
}
