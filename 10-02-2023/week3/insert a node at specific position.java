class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    SinglyLinkedListNode curr=llist;
    SinglyLinkedListNode node=new SinglyLinkedListNode(data);
    if(position == 0){
      node.next=curr;
      node=llist;
    }
    for(int i=0;i<position-1;i++){
        curr=curr.next;
    }
    node.next=curr.next;
    curr.next=node;
    return llist;
    }

}
