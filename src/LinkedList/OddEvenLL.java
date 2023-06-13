package LinkedList;

import LinkedList.Utils.ListNode;

public class OddEvenLL {
    public static void main(String[] args) {
        ListNode head = ListNode.insert(new int[]{1, 2, 3, 4, 5});
        ListNode result = oddEvenList(head);
        ListNode.print(result);
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode evenList = new ListNode();
        ListNode oddList = new ListNode();
        ListNode evenHead = evenList;
        ListNode oddHead = oddList;
        while (head != null) {
            if (head.val % 2 == 0) {
                evenList.next = head;
                evenList = head;
            } else {
                oddList.next = head;
                oddList = head;
            }
            head = head.next;
        }
        evenList.next=null;
        oddList.next = evenHead.next;
        return oddHead.next;
    }
}
