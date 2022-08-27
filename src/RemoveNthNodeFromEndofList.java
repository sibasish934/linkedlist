class Solution {
    public ListNode sortList(ListNode head) {
        List <Integer> l = new ArrayList<>();
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp = head;
        
        while(temp != null){
            l.add(temp.val);
            temp = temp.next;
        }
        
        Collections.sort(l);
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        for(int val : l){
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        
        return dummy.next;
    }
}
