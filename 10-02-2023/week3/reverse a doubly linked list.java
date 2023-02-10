class Result{
public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
    DoublyLinkedListNode p=llist;
    while(p != null){
        p=llist.next;
        llist.next=llist.prev;
        llist.prev=p;
        if(p!=null){
            llist=p;
        }
    }
    return llist;

    }

}
