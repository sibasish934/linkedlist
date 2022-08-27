class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        {
            return null;
        }
        ListNode fastPtr = head;
        ListNode slowPtr =  head;
        ListNode prev = null;
        
        while(fastPtr != null && fastPtr.next!= null)
        {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        prev.next = slowPtr.next;
        return head;
    }
}
