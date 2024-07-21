class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;  
    }
}
class SLL{
    Node head;
public Node insertAtBegining(Node head , int val)
{
    Node temp = new Node(val);
    if(head == null)
    {
   head = temp;
    }
    else
    {
        temp.next = head; 
        head = temp;
    }
    return head;
   
}
public Node insertAtEnd(Node head , int val)
{ 
    Node newNode = new Node(val);
    Node temp = head;
    if(head == null)
    {
       temp = newNode;
    }
    else{
        while(temp.next != null)
        {
            temp = temp.next;
        }
      temp.next = newNode;
    }
    return temp;
}
public void display(Node head)
{
    if(head == null)
    {
        System.out.println("list empty");
    }
    else{
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
}
public class SinglyLL{
    public static Node mergeList(Node head1 , Node head2)
    {
        Node newHead = new Node(0);
        Node temp = newHead;
        boolean toogle = true;
        while(head1 != null && head2 != null)
        { 
            if(toogle)
            {
            temp.next = head1;
            head1 = head1.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
            toogle = !toogle;
        }
        if(head1 != null) //list2 is empty
        {
            temp.next = head1;
        }
        else{
            temp.next = head2;
        }
        return newHead.next;

    }
    public Node sumOfList(Node head1 , Node head2) // sum of reversed linked list
    {
       Node newHead = new Node(0);
       Node temp = newHead;
       int carry = 0;
       while(head1 != null && head2 != null|| carry != 0)
       {
        if(head1 != null)
        {
            carry = carry + head1.data;
            head1 = head1.next;
        }
        if(head2 != null)
        {
            carry = carry + head2.data;
            head2 = head2.next;
        }
        temp.next = new Node(carry%10);
        carry = carry/10;
        temp = temp.next;
       }
       return newHead.next;
    }
    public static void main(String[] args){
        SLL list = new SLL();
        Node head = null;
        head = list.insertAtBegining(head, 100);
        list.insertAtEnd(head, 300);
        list.insertAtEnd(head, 500);
        list.insertAtEnd(head,700);
        list.display(head);
        SLL list2 = new SLL();
        Node head2 = null;
        head2 = list2.insertAtBegining(head2, 101);
        list2.insertAtEnd(head2, 301);
        list2.insertAtEnd(head2, 501);
        list2.insertAtEnd(head2,701);
        list2.display(head2);
         head = mergeList(head, head2);
         list.display(head);

    }
}

