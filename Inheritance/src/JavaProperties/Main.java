package JavaProperties;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.height + " "+ box.length+" "+box.width+" ");

        Box box1 = new Box(1,2,3);
        System.out.println(box1.height + " "+ box1.length+" "+box1.width+" ");
    }

}
