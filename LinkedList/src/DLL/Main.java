package DLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(99);
        list.insertAfter(99,56);

        list.display();

    }
}
