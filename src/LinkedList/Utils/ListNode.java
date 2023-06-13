package LinkedList.Utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode insert(int[] nums) {
        ListNode head = new ListNode(0);
        ListNode prev = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            head = new ListNode(nums[i]);
            head.next = prev;
            prev = head;
        }
        return head;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
