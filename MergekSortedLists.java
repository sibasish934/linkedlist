class Solution{
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        
        List < Integer> l = new ArrayList<>();
        
        for(ListNode list : lists){
            while(list != null){
                l.add(list.val);
                list = list.next;
            }
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
