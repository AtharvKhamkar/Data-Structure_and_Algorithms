public class Solution {
    public static void main(String[] args){
        Student student1 = new Student(10,"Atharv",95);
        Student other = new Student(student1);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println("Values from other constructor");
        System.out.println(other.rno);
        System.out.println(other.name);
        System.out.println(other.marks);
    }


}

class Student{
    int rno;
    String name;
    float marks;

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


    // we can create a contructor that can also take object as a argument in contructor
    Student(Student student1){
        this.rno = student1.rno;
        this.name = student1.name;
        this.marks = student1.marks;
    }
}
