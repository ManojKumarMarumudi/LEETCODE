class Result {

    /*
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
    List<Integer> lst = new ArrayList<>();
    for(int i=0;i<arr.size()-1;i++){
        for(int j=i+1;j<arr.size();j++){
            if((arr.get(i)+arr.get(j)) == m){
                lst.add(i+1);
                lst.add(j+1);
                break;
            }
        }
    }
    return lst;
    }

}
