package LinkedList;

import LinkedList.Utils.ListNode;

public class ReverseLL {
    public static void main(String[] args) {
        ListNode list = ListNode.insert(new int[]{1,2,3,4,5});
        ListNode.print(reverseList(list));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode prev =null;
        while(head!=null){
            temp = head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}
