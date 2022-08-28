package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Student;

import java.util.List;
@Repository
public interface StudentRepository {
    void saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

    void updateStudent(Student student);
}
