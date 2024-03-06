package org.example.DLL;

public class Main {
    public static void main(String[] args){
        DLL list = new DLL();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertAfter(100,5);

        list.display();


    }
}
