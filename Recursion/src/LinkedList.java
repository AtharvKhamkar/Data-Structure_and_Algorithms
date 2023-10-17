import java.util.Arrays;

public class LinkedList{
    Node head;
    Node tail;
    int size;

    LinkedList() {
        size = 0;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        tail.next = head;
    }

    public void addLast(int value) {
        if (size == 0) {
            addFirst(value);
        } else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

    }

    public void addMid(int value , int index){
        if(index==0){
            addFirst(value);
        }
        if(index==size){
            addLast(value);
        }
        else{
            Node newNode = new Node(value);
            Node temp = head;
            for(int i=0;i<(index-1);i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.display();
    }

}