import java.util.*;
class Node
{
    int val;
    Node next;
    Node prev;

    Node(int val)
        {
            this.val = val;
        }
}

public class doublyLinkList {

    Node head;
    Node tail;
    int size = 0;

    void CreateDoublyLinkList(int[] arr)
    {
        if(arr.length == 0) return;

        head = new Node(arr[0]);
        tail = head;
        size = 1;
        for(int i=1; i<arr.length; i++)
        {
            Node newNode = new Node(arr[i]);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    void insertAtHead(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val)
    {
        Node temp = new Node(val);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
            size++;
        }
        
    }

    void deleteAtHead()
    {
        
        if(head == null)
        {
            System.out.print("Head is Empty");
            return;
        }
        else if (size == 1)
        {
            head = tail = null; 
        }
        else
        {
            head = head.next;
            head.prev = null;
        }
        size--;
        
    }

    void deleteAtTail()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return;
        }
        if(size == 1) head = tail = null;
        else
        {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    static void print(Node head)
    {
        Node temp = head;
        while( temp != null)
        {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        int[] arr = {1,3,4,5,7,8,3,46};

        doublyLinkList list = new doublyLinkList();
        list.CreateDoublyLinkList(arr);
        print(list.head);
        list.insertAtHead(45);
        print(list.head);
        list.insertAtTail(90);
        print(list.head);
        list.deleteAtHead();
        print(list.head);
        list.deleteAtTail();
        print(list.head);
    }
}
