package org.example.DLL;

public class DLL {
    private Node head;
    private int size;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


    }
    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.value + "->" );
            last = last.prev;
        }
        System.out.print("Start");
    }

    public Node giveLastNode(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    public void insertLast(int value){
        if(size < 1){
            insertFirst(value);
            return;
        }
        Node lastNode = giveLastNode();
        Node node = new Node(value);
        lastNode.next = node;
        node.prev = lastNode;
        node.next = null;
        size++;
    }

    public Node giveNodeAtIndex(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int getSize(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }


    public void insertAfter(int value,int index){
        int llSize = getSize();
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == llSize-1){
            insertLast(value);
            return;
        }
        Node temp = giveNodeAtIndex(index);
        Node node = new Node(value);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }


}
