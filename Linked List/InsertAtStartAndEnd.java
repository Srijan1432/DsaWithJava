import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}
public class InsertAtStartAndEnd {

    static Node CreateLinkList(int arr[])
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

    static Node insertAtStart(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
        
    }

    static void print(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] arr = {10,20,30,40,50};
        Node head = CreateLinkList(arr);
        print(head);

        head = insertAtStart(head,45);
        print(head);


    }
}
