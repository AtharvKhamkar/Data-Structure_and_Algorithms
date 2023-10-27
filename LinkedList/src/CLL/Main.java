package CLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.delete(30);
        list.display();

    }
}
