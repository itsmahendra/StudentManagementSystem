import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, age, marks);

                    manager.addStudent(student);
                    break;

                case 2:
                    manager.showAllStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    manager.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    manager.updateStudent(
                        updateId,
                        newName,
                        newAge,
                        newMarks
                    );

                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    manager.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Program exited.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
