class Result {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-k;i++){
            int res=arr.get(i+k-1)-arr.get(i);
            if(ans>res){
                ans=res;
            }
        }
        return ans;
    }

}
