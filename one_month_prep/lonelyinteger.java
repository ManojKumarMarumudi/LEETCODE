class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
     List<Integer> lst = new ArrayList<>();
        for(Integer num:a){
            if(lst.remove(num)==false){
                lst.add(num);
            }
       }
       return lst.get(0);
    }

}
