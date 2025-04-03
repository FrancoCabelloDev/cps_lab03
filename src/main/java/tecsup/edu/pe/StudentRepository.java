package tecsup.edu.pe;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<String> students = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
    }

    public List<String> getAllStudents() {
        return students;
    }
}

