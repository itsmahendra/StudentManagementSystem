import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void showAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void updateStudent(int id, String name, int age, double marks) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setMarks(marks);

                System.out.println("Student updated.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
