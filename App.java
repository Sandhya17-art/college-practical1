import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Enter address");
        String address=scanner.nextLine();
        System.out.println("Enter roll");
        int roll=scanner.nextInt();
        System.out.println("Enter marks");
        int marks=scanner.nextInt();
        Student object= new Student(name, roll, address, marks);
        object.calcGrade();
        scanner.close();
    }
}