package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Student;
import peaksoft.repository.StudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
//@EnableTransactionManagement
public class StudentRepositoryImpl implements StudentRepository {
    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }
    @Override
    public Student getStudentById(Long id) {
        return entityManager.find(Student.class,id);
    }
    @Override
    public void deleteStudentById(Long id) {
        entityManager.remove(entityManager.find(Student.class,id));
    }
    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }
}
