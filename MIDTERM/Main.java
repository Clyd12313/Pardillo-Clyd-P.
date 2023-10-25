import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter First Name: ");
        student.setFirstName(input.nextLine());

        System.out.print("Enter Middle Name: ");
        student.setMiddleName(input.nextLine());

        System.out.print("Enter Last Name: ");
        student.setLastName(input.nextLine());

        System.out.print("Enter Suffix: ");
        student.setSuffix(input.nextLine());

        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Full Name: " + student.getFirstName() + " " + student.getMiddleName() + " " + student.getLastName() + " " + student.getSuffix());
    }
}
