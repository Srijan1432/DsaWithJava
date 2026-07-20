import java.util.*;

class Node
{
    int val;
    Node next;

    Node(int val)
    {
        this.val = val;
    }
}

public class InsertAtTail
{
    Node head;
    Node tail;

    void insertAtTail( int val)
    {
        if(head == null) head = tail = new Node(val);

        else
        {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    void insertAtHead(int val)
    {
        if(head == null) head = tail = new Node(val);
        else
        {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
    }

    static void print(Node head)
    {
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
        InsertAtTail list = new InsertAtTail();
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtHead(50);

        print(list.head);
    }
}
