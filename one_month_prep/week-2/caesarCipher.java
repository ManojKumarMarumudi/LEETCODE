class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    StringBuilder sb = new StringBuilder();
    char[] arr=s.toCharArray();
    for(char c:arr){
        if(c>='a' && c<='z'){
            c=(char) ('a'+(c-'a'+k)%26);
        }else if(c>='A' && c<='Z'){
            c=(char) ('A'+(c-'A'+k)%26);
        }
        sb.append(c);
    }
    return sb.toString();

    }

}
