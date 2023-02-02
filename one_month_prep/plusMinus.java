class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float pcount=0;
    float ncount=0;
    float zcount=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)<0){
            ncount+=1;
        }
        else if(arr.get(i)>0){
            pcount+=1;
        }else{
            zcount+=1;
        }  
    }
    System.out.printf("%f%n", pcount/arr.size(), 6);
    System.out.printf("%f%n", ncount/arr.size(), 6);
    System.out.printf("%f%n", zcount/arr.size(), 6);
        }

}
