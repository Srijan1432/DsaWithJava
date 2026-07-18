import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class linkedlist
{
    public static void main(String[] args)
    {
        Node head = new Node(10);
        Node h2 = new Node(20);
        Node h3 = new Node(30);

        System.out.println(head.next);
        head.next = h2;
        System.out.println(head.next);
        System.out.println(head.next.data);
        System.out.println(h2.next);
        h2.next = h3;
        System.out.println(h2.next);
        System.out.println(h2.next.data);
    }
}
