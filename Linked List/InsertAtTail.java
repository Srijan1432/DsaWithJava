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

    void deleteAtHead()
    {
        if(head == null) return;
        head = head.next;

        if(head == null) tail = null;
    }

    boolean search(int key)
    {
        if(head == null) return false;
        Node temp = head;
        while(temp != null)
        {
            if(temp.val == key) return true;
            temp = temp.next;
        }
        return false;
    }

    void insertAtIndex(int idx, int val)
    {
        Node temp = head;
        Node t = new Node(val);
        for(int i=0; i<idx-1; i++)
        {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    void deleteAtIndex(int idx)
    {
        Node temp = head;
        for(int i=1; i<=idx-1; i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }
    static void print(Node head)
    {
        if (head == null) return;
        while(head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        InsertAtTail list = new InsertAtTail();
        list.insertAtTail(60);
        list.insertAtTail(70);
        list.insertAtHead(50);
        list.insertAtHead(45);
        list.insertAtHead(18);
        print(list.head);
        list.deleteAtHead();

        print(list.head);

        System.out.print(list.search(45));
        System.out.println();

        list.insertAtIndex(2, 38 );
        list.insertAtIndex(3, 99 );
        print(list.head);
        list.deleteAtIndex(3);
        print(list.head);
    }
}
