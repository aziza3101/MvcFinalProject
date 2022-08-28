package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Instructor;
import peaksoft.repository.InstructorRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
//@EnableTransactionManagement
public class InstructorRepositoryImpl implements InstructorRepository {
    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.persist(instructor);
    }
    @Override
    public List<Instructor> getAllInstructors() {
        return entityManager.createQuery("SELECT i FROM Instructor i", Instructor.class).getResultList();
    }
    @Override
    public Instructor getInstructorById(Long id) {
        return entityManager.find(Instructor.class,id);
    }
    @Override
    public void deleteInstructorById(Long id) {
        entityManager.remove(entityManager.find(Instructor.class,id));
    }
    @Override
    public void updateInstructor(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    public void assignInstructorToCourse(Long InstructorId, Long CourseId) {

    }
}
