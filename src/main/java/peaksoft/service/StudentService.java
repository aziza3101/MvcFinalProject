package peaksoft.service;

import org.springframework.stereotype.Service;
import peaksoft.entity.Student;

import java.util.List;
@Service
public interface StudentService {
    void saveStudent(Student student);

    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void updateStudent(Long id, Student student);
    void deleteStudentById(Long id);
    void assignStudentToCourse(Long studentId, Long CourseId);

}
