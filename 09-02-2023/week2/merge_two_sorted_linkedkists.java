static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedList list = new SinglyLinkedList();
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                list.insertNode(head1.data);
                head1 = head1.next;
            }else{
                list.insertNode(head2.data);
                head2 = head2.next;
            }
        }
        if(head2==null){
            while(head1!=null){
                list.insertNode(head1.data);
                head1 = head1.next;
            }
        }else{
            while(head2!=null){
                list.insertNode(head2.data);
                head2 = head2.next;
            }
        }
        return list.head;
    }
