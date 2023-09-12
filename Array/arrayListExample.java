import java.util.*;
public class arrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(67);
//        list.add(69);
//        list.add(70);
//        list.add(789);

//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        System.out.println(list);

    }
}
