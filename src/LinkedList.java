public class LinkedList {
    private static Node head;
    private static class Node{
        private final int data;
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

    public static int DeleteATgivenPos(int pos){
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
        DeleteFirst();
        traverse();
        deleteEnd();
        traverse();
        DeleteATgivenPos(3);
        traverse();
        boolean ser = search(8);
        System.out.println(ser);
        System.out.println("\n The length of the linked list is "+(lengthofLinkedList()));
    }
}
