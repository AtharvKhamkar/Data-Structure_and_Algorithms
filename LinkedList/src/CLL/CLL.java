package CLL;

public class CLL {
    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    //function to insert node after the tail in CLL
    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //function to delete node from CLL
    public void delete(int value){
        Node node = head;
        if(head == null){
            return;
        }

        if(head.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
    }
}
