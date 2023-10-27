package DLL;

import LL.LL;

public class DLL {

    private Node head;
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    //Function to display the values in DLL
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        //to display link list in a reverse order
        while(last != null){
            System.out.print(last.value + "<-");
            last = last.prev;
        }
        System.out.println("START");
    }

    //function to add a new node at the start of the double link list
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    //function to add node at the last of the DLL
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    //function to add  node after given index
    public Node search(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }else{
                node = node.next;
            }
        }
        return null;
    }
    public void insertAfter(int after ,int value) {
        Node p = search(after);
        Node node = new Node(value);
        if (p == null) {
            System.out.println("Element not found");
        }

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


}
