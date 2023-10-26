package LL;

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

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



    //Function to display the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //Function to add Node at first position of the linked list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    //function to add node at the last of the linked list
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;
        size++;
    }

    //function to add new node at given index in a linked list

    public void insert(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    //function to delete first element from the linked list
    public void deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        System.out.println(value);
    }

    //Function to delete node at the last
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
    }

    public void deleteLast(){
        if(size == 1){
            deleteFirst();
            return;
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        System.out.println(value);
    }

    //function to delete node at a particular index
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size -1){
            deleteLast();
            return;
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        System.out.println(value);

    }

    //function to search particular node in a linked list
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
}
