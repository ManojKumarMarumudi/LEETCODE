class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
     List<Integer> res=new ArrayList<>();
    for(String str:queries){
        res.add(Collections.frequency(strings,str));
    }
    return res;

    }

}
