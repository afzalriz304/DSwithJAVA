package LinkedList.Medium;

import LinkedList.Utils.ListNode;

public class RemoveDuplicateFromSortedList2 {
    public static void main(String[] args) {
        ListNode listNode = ListNode.insert(new int[]{1, 2,3,3});
        ListNode.print(deleteDuplicates(listNode));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;;
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode prev = dummy;
        while (head!=null){
            if(head.next!=null && head.val==head.next.val){
                //skipping the duplicate
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next = head.next;
            }else{
                prev = head;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
