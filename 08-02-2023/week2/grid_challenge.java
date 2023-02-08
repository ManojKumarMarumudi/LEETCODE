class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    List<String> lst = new ArrayList<>();
    for(int m=0;m<grid.size();m++){
        String s = sort(grid.get(m));
        lst.add(s);
    }
    int size = lst.get(0).length();
    for(int i=1;i<lst.size();i++){
        for(int j=0;j<size;j++){
            if(lst.get(i-1).charAt(j)>lst.get(i).charAt(j)){
                return "NO";
            }
        }
    }
    return "YES";
    }
    public static String sort(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
  }
}
