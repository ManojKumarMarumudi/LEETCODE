class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        Collections.sort(ar);
        int count=0;
        for(int i=0;i<ar.size()-1;){
            if(ar.get(i)==ar.get(i+1)){
                count+=1;
                i+=2;
            }else{
                i++;
            }
        }
        return count;

    }

}
