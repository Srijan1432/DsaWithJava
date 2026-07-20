import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}


public class CreateLinkList {

    static Node CreateLinkedList(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node tail = head;

        for (int i=1; i<arr.length; i++)
        {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    static void print(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {10,20,35,45,68};

        Node head = CreateLinkedList(arr);
        print(head);
    }
}
