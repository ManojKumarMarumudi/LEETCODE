class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
        if (n.length()==1 && k==1) {
        return Integer.parseInt(n);
        }
        long sum=0;
        for (char i : n.toCharArray()) {
            sum+=i-'0';
        }
        
        return superDigit(""+sum*k, 1);    
    }

}
