package org.example.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertLast(60);
        System.out.println(list.findNode(40));



        System.out.println(list.getLLSize());

        list.display();
    }
}
