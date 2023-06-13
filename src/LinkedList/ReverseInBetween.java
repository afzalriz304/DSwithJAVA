package LinkedList;

import LinkedList.Utils.ListNode;

public class ReverseInBetween {
    public static void main(String[] args) {
        ListNode listNode0 = ListNode.insert(new int[]{1, 2, 3, 4, 5});
        ListNode listNode1 = ListNode.insert(new int[]{5});
        ListNode.print(reverseBetween(listNode0, 2, 4));
        ListNode.print(reverseBetween(listNode1, 1, 1));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy = new ListNode();
       dummy.next=head;
       ListNode prev = null;
       ListNode currentNode = head;
       while(left>1){
           prev=currentNode;
           currentNode=currentNode.next;
           left--;
           right--;
       }
       ListNode innerHead = prev;
       ListNode tail = currentNode;
       while (right>0){
           ListNode temp = currentNode.next;
           currentNode.next=prev;
           prev=currentNode;
           currentNode=temp;
           right--;
       }
       if(innerHead!=null){
           innerHead.next=prev;
       }else{
           dummy.next=prev;
       }
       tail.next=currentNode;
       return dummy.next;
    }
}
