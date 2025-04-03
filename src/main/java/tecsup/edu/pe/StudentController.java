package tecsup.edu.pe;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void addStudent(String studentName) {
        studentService.addStudent(studentName);
    }

    public void printStudents() {
        studentService.getStudents().forEach(System.out::println);
    }
}