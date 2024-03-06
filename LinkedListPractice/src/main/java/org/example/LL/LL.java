package org.example.LL;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }


    //Functions on Linked List
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
        }else{
            Node node = new Node(val);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertAt(int val,int index){
        if(index == size){
            insertLast(val);
        }
        if(index == 0){
            insertFirst(val);
        }
        Node temp = head;

        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    //method to delete node from link list

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

    }

    public int deleteLast(){
        int count = getLLSize();
        if(count <= 1){
            deleteFirst();
        }
        Node temp = head;
        for(int i=0; i<count-2; i++){
            temp = temp.next;
        }
        int val = tail.value;
        tail=temp;
        temp.next = null;
        size--;
        return val;
    }

    public int deleteLastAlt(){
        if(size == 1){
            return deleteFirst();

        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        System.out.println(value);
        return value;
    }

    public void replaceAt(int index,int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node temp = get(index-1);
        Node node = new Node(value);
        node.next = temp.next.next;
        temp.next = node;
    }

    public void deleteAt(int index){
        if(index < 1){
            deleteFirst();
            return;
        }
       Node temp = get(index-1);
       temp.next = temp.next.next;
       size--;
    }


   //get elements
    public int getLLSize(){
        int size = 1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int getValue(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    //pass the value and method returns the node having the same value as passed
    public int findNode(int value){
        Node temp = head;
        int size = getLLSize();
        for(int i=0;i<size;i++){
            if(temp.value == value){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
