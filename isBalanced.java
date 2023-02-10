class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            st.push(s.charAt(i));
        }else{
            if(st.isEmpty()){
                return "NO";
            }
            char pop_ele=st.pop();
            if(s.charAt(i)==')' && pop_ele!='('){
                return "NO";
            }if(s.charAt(i)==']' && pop_ele!='['){
                return "NO";
            }if(s.charAt(i)=='}' && pop_ele!='{'){
                return "NO";
            }
        }
    }
    if(st.isEmpty()){
        return "YES";
    }else{
        return "NO";
    }

    }

}
