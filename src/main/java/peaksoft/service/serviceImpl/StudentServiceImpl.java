package peaksoft.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.entity.Student;
import peaksoft.repository.StudentRepository;
import peaksoft.service.StudentService;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Autowired

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteStudentById(id);
    }

    @Override
    public void assignStudentToCourse(Long studentId, Long CourseId) {

    }
    @Override
    public void updateStudent(Long id, Student student) {
        studentRepository.updateStudent(student);
    }
}
