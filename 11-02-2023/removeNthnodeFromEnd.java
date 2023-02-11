/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       int count=0;
       while(temp != null){
           temp=temp.next;
           count+=1;
       }
       if(count==n){
           head=head.next;
           return head;
       }
       if(count==1){
           return head;
       }
       ListNode first=head;
       for(int i=1;i<count-n;i++){
           first=first.next;
       }
       first.next=first.next.next;
       return head;
    }
}
