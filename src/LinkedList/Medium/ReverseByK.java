package LinkedList.Medium;

import LinkedList.Utils.ListNode;

public class ReverseByK {
    public static void main(String[] args) {
        //ListNode listNode = ListNode.insert(new int[]{1,2,3,4,5});
        ListNode listNode = ListNode.insert(new int[]{1});
        //ListNode.print(rotateRight(listNode,2));
        ListNode.print(rotateRight(listNode,99));
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
            return head;
        // find length
        int len =0;
        ListNode secondHead = head;
        while(secondHead!=null){
            len++;
            secondHead=secondHead.next;
        }
        if(k>len)
            k=k%len;
        while(k>0){
            head = reverse(head);
            k--;
        }
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev =null;
        while (head.next!=null){
            prev=head;
            head=head.next;
        }
        head.next=current;
        prev.next=null;
        return head;
    }

    public char findTheDifference(String s, String t) {
        char result = 0;
        char[] sChar = new char[26];
        char[] tChar = new char[26];
        for(int i=0;i<s.length();i++){
            sChar['a'-s.charAt(i)]++;
        }

        for(int i=0;i<t.length();i++){
            tChar['a'-t.charAt(i)]++;
        }

        for(int i=0;i<tChar.length;i++){
            if(sChar[i]!=tChar[i]){
                return (char)(i+'a');
            }
        }
        return result;
    }
}
