package LinkedList.Easy;

import LinkedList.Utils.ListNode;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        ListNode listNode = ListNode.insert(new int[]{1,1,2,3,3});
        ListNode listNode0 = ListNode.insert(new int[]{1,1,1,1,1});
        ListNode.print(deleteDuplicates(listNode));
        ListNode.print(deleteDuplicates(listNode0));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode first = head;
        ListNode second = head;
        while (second!=null){
            if(first.val !=second.val){
                first.next = second;
                first=second;
            }
            second =second.next;
        }
        first.next=null;
        return dummy.next;
    }
}
