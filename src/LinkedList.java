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


    public static void main(String[] args) {
        LinkedList sl = new LinkedList();
        head = new Node(10);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        insertBeginning();
        insertEnd();
        traverse();
        System.out.println("\n The length of the linked list is "+(lengthofLinkedList()));
    }
}
