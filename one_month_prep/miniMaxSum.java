class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long max=Collections.max(arr);
    long min=Collections.min(arr);
    long sum=0;
    for(int i=0;i<arr.size();i++){
        sum+=arr.get(i);
    }
    System.out.println((sum-max)+" "+(sum-min));

    }

}
