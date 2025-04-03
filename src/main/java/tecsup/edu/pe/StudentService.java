package tecsup.edu.pe;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<String> students = new ArrayList<>();

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public List<String> getStudents() {
        return students;
    }
}