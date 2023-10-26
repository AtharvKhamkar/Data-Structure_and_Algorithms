package LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(99);
        list.insert(100,4);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        list.search(100);



    }
}
