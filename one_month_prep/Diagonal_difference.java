class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sum=0;
        int j;
        for (int i=0;i<arr.size();i++) {
                j=arr.size()-1-i;
                sum+=(arr.get(i).get(i)-arr.get(j).get(i));
        }
        return Math.abs(sum);
    }

}
