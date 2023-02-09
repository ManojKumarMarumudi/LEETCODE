class Result {

    /*
     * Complete the 'reverse' function below.
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

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode head = llist;
    SinglyLinkedListNode tail = llist.next;
    llist.next = null;
    while (tail != null) {
        llist = head;
        head = tail;
        tail = tail.next;
        head.next = llist;
    }
    return head;
    }
}
