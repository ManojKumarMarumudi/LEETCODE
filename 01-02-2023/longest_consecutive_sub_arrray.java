import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs=new HashSet<Integer>();
        for(int i:nums){
            hs.add(i);
        }
        int longest=0;
        for(int num:nums){
            if(!hs.contains(num-1)){
                int curr=num;
                int new_len=1;
                while(hs.contains(curr+1)){
                    curr+=1;
                    new_len+=1;
                }
                longest=Math.max(new_len,longest);
            }
        }
        return longest;
    }
}
