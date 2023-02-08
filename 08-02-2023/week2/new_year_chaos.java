class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
    int bribes = 0;  
    while(q.size() > 1) {
        int n = q.size(); 
        if (n == q.get(n-1)){
            q.remove(n-1);
            continue;
        }
        if(n == q.get(n-2)){
            bribes++;
            q.remove(n-2);
            continue;
        }
        if(n == q.get(n-3)){
            bribes = bribes + 2;
            q.remove(n-3);
            continue;
        }
        System.out.println("Too chaotic");
        return;
    } 
    System.out.println(bribes);
    }
}
