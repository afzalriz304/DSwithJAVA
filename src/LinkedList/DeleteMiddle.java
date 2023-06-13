package LinkedList;

import LinkedList.Utils.ListNode;

import static LinkedList.Utils.ListNode.insert;
import static LinkedList.Utils.ListNode.print;

public class DeleteMiddle {
    public static void main(String[] args) {
        ListNode linkedList0 = insert(new int[]{1, 2, 3, 4});
        ListNode linkedList1 = insert(new int[]{1, 3, 4, 7, 1, 2, 6});
        print(deleteMiddle(linkedList0));
        System.out.println("--------------");
        print(deleteMiddle(linkedList1));
    }

    public static ListNode deleteMiddle(ListNode head) {
        ListNode dummy = head;
        int len = 0;
        int middle;
        while (head != null) {
            len++;
            head = head.next;
        }
        if (len % 2 == 0) {
            middle = len / 2 + 1;
        } else {
            middle = len / 2;
        }
        int currentNode = 1;
        ListNode result = dummy;
        while (dummy != null) {
            if (currentNode == middle-1) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
            currentNode++;
        }
        return result;
    }

}
