class Solution {
    static void subsequence(int ind,int[] arr, List<Integer> lst ,List<List<Integer>> res){
        if(res.contains(lst))
            return;
        if(ind==arr.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        lst.add(arr[ind]);
        subsequence(ind+1, arr, lst, res);
        lst.remove(lst.size()-1);
        subsequence(ind+1, arr, lst, res);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        subsequence(0, nums, new ArrayList<>(), res);
        return res;
    }
}
