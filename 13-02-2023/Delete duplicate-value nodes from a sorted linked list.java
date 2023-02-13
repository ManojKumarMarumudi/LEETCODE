class Result {

    /*
     * Complete the 'removeDuplicates' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
        List<Integer> lst = new ArrayList<>();
        SinglyLinkedListNode head=llist;
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode prev = null;
        while(curr!=null){
            if(lst.contains(curr.data)){
                prev.next = curr.next;
            }else {
                lst.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return llist;

    }

}
