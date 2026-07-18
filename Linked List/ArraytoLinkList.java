import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}

public class ArraytoLinkList {

    static Node CreateLinkList(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i=1; i<arr.length; i++)
        {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static void print(Node head)
        {
            while(head != null)
            {
                System.out.print(head.data+ " ");
                head = head.next;
            }
        }
    
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};

        Node head = CreateLinkList(arr);
        print(head);
    }
}
