import java.util.*;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Id");
        int empId = sc.nextInt();
        System.out.println("Enter the department");
        String department = sc.next();

        switch(empId){
            case 1:
                System.out.println("Atharv Khamkar");
                break;
            case 2:
                System.out.println("Aditya Khamkar");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter a valid data");
        }
    }
}
