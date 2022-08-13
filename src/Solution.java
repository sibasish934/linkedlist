class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;
        ListNode previous = null;
        int count =1;

        while(count != left)
        {
            previous = current;
            current = current.next;
            count++;
        }

        ListNode start = current;

        while(count != right)
        {
            current = current.next;
            count++;
        }

        ListNode rest = current.next;
        current.next = null;

        ListNode newHead = reverse(start);

        if(previous != null)
        {
            previous.next = newHead;
        }
        current = newHead;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = rest;

        if(left == 1)
        {
            return newHead;
        }
        else
        {
            return head;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode next;
        ListNode prev = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}