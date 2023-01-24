class Solution {
    public String minWindow(String s, String t) {
        int first = 0;
        int last = 0;
        int[] map = new int[128];
        int counter = 0;
        for(char ch:t.toCharArray()) {
            map[ch]++;
            counter++;
        }
        int minLen = Integer.MAX_VALUE;
        String str = "";
        while(last<s.length()) {
            char ch = s.charAt(last);
            if(map[ch]>0) {
                counter--;
            }
            map[ch]--;
            if(counter == 0) {
                while(first<=last && map[s.charAt(first)] <0) {
                    map[s.charAt(first)]++;
                    first++;
                }
                if(last-first+1<minLen) {
                    minLen = last - first + 1;
                    str = s.substring(first, last+1);
                }
            }
            last++;
        }
        return str;
        
    }
}
