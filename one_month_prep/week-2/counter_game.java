class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
    // Write your code here
        boolean win=true;
        while(n>1){
          win=!win;
          if(n!=0 && (n&(n-1))==0){
            n/=2;
          }else{
            long p=(long)(Math.log(n)/Math.log(2));
            long next=(long)Math.pow(2, p);
            n-=next;
          }
      }
      if(win){
          return "Richard";
      }else{
          return "Louise";
      }
    }

}
