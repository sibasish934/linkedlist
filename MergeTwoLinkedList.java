public class solution{
 public static ListNode merge(ListNode list1 , ListNode list2)
 {
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    
    while(list1 != null && list2!= null)
    {
        if(list1.val <= list2.val)
        {
           temp.next = list1;
           list1 = list1.next;
        }
        else{
          temp.next = list2;
          list2 = list2.next;
        }
       temp = temp.next;
    }
   
    if(list1 != null)
    {
       temp.next = list2;
    }
    else{
      temp.next =- list1;
    }
   
   return dummy.next;
        
