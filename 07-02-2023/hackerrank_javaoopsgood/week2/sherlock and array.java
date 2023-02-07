class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
    // Write your code here
        int lsum = 0;
        int totsum = 0;
        int rsum = 0;
        for(int i : arr){
            totsum += i;
        }
        for(int i=0;i<arr.size();i++){
            rsum=totsum-lsum-arr.get(i);
            if(lsum==rsum){
                return "YES";
            }
            lsum += arr.get(i);
        }
        return "NO";
    }
}
