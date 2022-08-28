package peaksoft.repository.repositoryImpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import peaksoft.entity.Course;
import peaksoft.repository.CourseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
//@EnableTransactionManagement
public class CourseRepositoryImpl implements CourseRepository {
    @PersistenceContext
    private  EntityManager entityManager;
    @Override
    public void saveCourse(Course course) {
        entityManager.persist(course);
    }
    @Override
    public List<Course> getAllCourses(Long companyId) {
        return entityManager.createQuery("SELECT c FROM Course c " +
                "where c.company.id =:companyId", Course.class)
                .setParameter("companyId",companyId).getResultList();

    }
    @Override
    public Course getCourseById(Long id) {
        return entityManager.find(Course.class,id);
    }
    @Override
    public void deleteCourseById(Long id) {
        entityManager.remove(entityManager.find(Course.class,id));
    }
    @Override
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }
}
