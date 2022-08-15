public class LinkedList {
    private static Node head;
    private static class Node{
        private int data;
        private Node next;

        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    public  static void traverse(){
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println("\n");
    }
     public static int lengthofLinkedList(){
        Node temp= head;
        int count = 0;
        while(temp != null)
        {
            count = count + 1;
            temp = temp.next;
        }
        return count;
     }

     public static void insertBeginning(){
        Node newnode = new Node(6);
        newnode.next = head;
        head = newnode;
     }

     public static void insertAtgivenpos(int position , int value)
     {
           int count = 1;
           Node newnode = new Node(value);
            if(position == 1)
            {
                newnode.next = head;
                head = newnode;
            }
            else{
                Node previous = head;
                while(count < position -1)
                {
                    count++;
                    previous = previous.next;
                }
                Node current = previous.next;
                newnode.next = current;
                previous.next = newnode;
            }
     }

     public static boolean search(int data){
        Node temp = head;
        if(head == null)
        {
            return false;
        }
        while(temp != null)
        {
            if (temp.data == data)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
     }

     public static void insertEnd()
     {
         Node newnode = new Node(11);
         Node temp = head;
         if(temp == null)
         {
             newnode = head;
             return ;
         }
         while(temp.next != null)
         {
             temp = temp.next;
         }
         temp.next = newnode;
     }

     public static int DeleteFirst(){
        if(head == null)
        {
            return -1;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;
     }

     public static int deleteEnd(){
        if(head == null)
        {
            return -1;
        }
        if(head.next == null)
        {
            return head.data;
        }
        Node temp = head;
        Node previous = null;
        while(temp.next != null)
        {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
        return temp.data;
     }

    public static int deleteAtGivenPos(int pos){
        if(pos == 1)
        {
            head = head.next;
            return head.data;
        }
        Node previous = head;
        int count = 0;
        while(count < pos -1)
        {
            count++;
            previous = previous.next;
        }
        Node temp = previous.next;
        previous.next = temp.next;
        return temp.data;
    }

    public static int middleReturn(){
        Node slowPtr = head;
        Node firstPtr = head;
        while(firstPtr != null && firstPtr.next != null){
            slowPtr = slowPtr.next;
            firstPtr = firstPtr.next.next;
        }
        return slowPtr.data;
    }

    public static void sortLinkedList(){
        Node temp = head;
        while(temp.next != null)
        {
            if(temp.data < temp.next.data){
                int c = temp.data;
                temp.data = temp.next.data;
                temp.next.data = c;
            }

            temp = temp.next;
        }
    }

    public static void deleteWithKey(int key)
    {
        Node current = head;
        Node temp = null;

        if (current.next != null && current.data == key)
        {
            head = current.next;
            return;
        }

        while(current != null && current.data != key)
        {
            temp = current;
            current = current.next;
        }
        if(current == null)
        {
            return;
        }
        temp.next = current.next;
    }
    public boolean hasCycle(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
            {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr)
            {
                return getStartingNode(slowPtr,head);
            }
        }

        return null;

    }

    public static ListNode getStartingNode( ListNode slowPtr, ListNode head) {
        ListNode temp = head;

        while(temp != slowPtr)
        {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }

        return temp;
    }

    public static int countNodesinLoop(Node head)
    {
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr!=null && fastPtr.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
            {
                return count(slowPtr);
            }
        }

        return 0;
    }

    public static int count(Node slowPtr)
    {
        int count = 1;
        Node temp = slowPtr;
        while(temp.next != slowPtr)
        {
            temp = temp.next;
            // slowPtr = slowPtr.next;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
//        LinkedList sl = new LinkedList();
        head = new Node(10);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        insertBeginning();
        insertEnd();
        insertAtgivenpos(3,8);
        traverse();
        deleteWithKey(5);
        traverse();
//        DeleteFirst();
//        traverse();
//        deleteEnd();
//        traverse();
//        deleteAtGivenPos(3);
//        traverse();
//        System.out.println("\n The linkedList before sorting...");
//        sortLinkedList();
//        traverse();
//        System.out.println("\n The linkedList after the sorting...");
//        int middleElement = middleReturn();
//        System.out.println("\n The middle is "+middleElement);
        boolean ser = search(8);
        System.out.println(ser);
        System.out.println("\n The length of the linked list is "+(lengthofLinkedList()));
    }
}
